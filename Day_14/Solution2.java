//1456. Maximum Number of Vowels in a Substring of Given Length


class Solution2 {

   boolean isVowel(char ch) {
       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
           return true;
       }
       return false;
   }

    public int maxVowels(String s, int k) {
       int vcnt = 0;

       for(int i = 0; i < k; i++) {
           char ch = s.charAt(i);
           if(isVowel(ch)) {
               vcnt++;
           }
       }

       int result = vcnt;
        int idx = 0;
        for(int i = k; i < s.length(); i++) {
                char ch = s.charAt(i);
                char prech = s.charAt(idx++);

                if(isVowel(prech) && vcnt > 0) {
                    vcnt--;
                }

                if(isVowel(ch)) {
                    vcnt++;
                }

            result = Math.max(result , vcnt);
            // System.out.println(result);
            
        }

        return result;

    }
}