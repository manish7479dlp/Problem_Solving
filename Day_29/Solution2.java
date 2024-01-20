//Given a string S, find the length of the longest substring without repeating characters.

class Solution2{
    int longestUniqueSubsttr(String S) {
        HashSet<Character> hs = new HashSet<>();
        
        int maxi = Integer.MIN_VALUE;
        int x = 0;
        int i = 0;
        while(i < S.length()) {
            
            char ch = S.charAt(i);
            
            if(hs.contains(ch)) {
                hs.remove(S.charAt(x));
                x++;
                // hs.add(ch);
            } else {
                hs.add(ch);
                i++;
            }
            maxi = Math.max(maxi , hs.size());
        }
        
        return maxi;
    }
   
    
    /*
     TLE
    int longestUniqueSubsttr(String S){
         HashSet<Character> hs = new HashSet<>();
         
         int maxi = Integer.MIN_VALUE;
         
         for(int i = 0; i < S.length(); i++) {
             hs = new HashSet<>();
             for(int j = i; j < S.length(); j++) {
                 char ch = S.charAt(j);
                 if(!hs.contains(ch)) {
                     
                     hs.add(ch);
                     
                 } else {
                     hs = new HashSet<>();
                     hs.add(ch);
                 }
                 
                maxi = Math.max(maxi , hs.size());
             }
         }
         
         return maxi;
    }
    */
}