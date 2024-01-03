//Smallest window containing 0, 1 and 2

class Solution1{
    public int smallestSubstring(String S) {
        // Code here
        int[] fre = new int[3];
        Arrays.fill(fre , -1);
        int cnt = 0;
        int result = 99999;
        
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int idx = ch - '0';
            
            if(fre[idx] == -1) {
                cnt++;
                fre[idx] = i;
                // System.out.println(cnt);
            } 
            
          else  if(fre[idx] != -1) {
                fre[idx] = i;
            }
            
            if(cnt == 3) {
                cnt = 1;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                
                 for(int j = 0; j < fre.length; j++) {
                     if(fre[j] < min) {
                         min = fre[j];
                     }
                     
                     if(fre[j] > max) {
                         max = fre[j];
                     }
                     
                     fre[j] = -1;
                 }
                //  System.out.println(result);
                fre[idx] = i;
                
                // for(int elm : fre) {
                //     System.out.println(elm);
                // }
                 
                 result = Math.min(result , (max - min) + 1);
            }
    
        }
        
        return result == 99999 ? -1 : result;
        
    }
};
