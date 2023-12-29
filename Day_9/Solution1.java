//Jump Game

class Solution {
    static int canReach(int[] A, int N) {
        // code here
        
        int reachable = 0;
        for(int i=0; i<N; i++)
        {
            if(reachable < i)
                return 0;
                
            reachable = Math.max(reachable, i + A[i]);
        }
        return 1;
    }
};