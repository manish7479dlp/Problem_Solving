//Coin Change


class Solution1 {
    
    
    public long f(int[] coins , int N , int sum, long[][] dp) {
        
        if(N == 0) {
            if(sum % coins[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        
        if(dp[N][sum] != 0) return dp[N][sum];
        
        long nt = f(coins , N - 1 , sum, dp);
        long t = 0;
        
        if(coins[N] <= sum) {
            t = f(coins , N , sum - coins[N] , dp);
        }
        
        return dp[N][sum] = nt + t;
    }
    
    
    
    public long count(int coins[], int N, int sum) {
        // code here.
        long[][] dp = new long[N][sum + 1];
        
        // for (long[] row: dp)
        //          Arrays.fill(row, 0);
                 
        
        for(int i = 0; i < dp[0].length; i++) {
            
            dp[0][i] = i % coins[0] == 0 ? 1 : 0;
        }
        
        for(int i = 1; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                
                long np = dp[i -1 ][j];
                long p = 0l;
                
                if(coins[i] <= j) {
                    p = dp[i][j - coins[i]];
                }
                
                dp[i][j] = p + np;
            }
        }
        
        return dp[N - 1][sum];
        
    }
}