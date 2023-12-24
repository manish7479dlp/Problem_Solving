//151. Reverse Words in a String

class Solution2 {
    public String reverseWords(String s) {
        // s = s.trim();
        StringBuilder strArr = new StringBuilder();
        
        String word = s.charAt(0) == ' ' ? "" : s.charAt(0) + "";
        for(int i = 1; i < s.length(); i++) {
             char ch = s.charAt(i);

             if(ch == ' ' && !word.equals("")) {
                 strArr.append(word + " ");
                 word = "";
             } else if(ch != ' ') {
                 word += ch;
             }
        }
        
        if(!word.equals("")  ) {
            strArr.append(word);
        }



        String[] arr = strArr.toString().split(" ");


        int lo = 0 , hi = arr.length - 1;

        while(lo <= hi) {
            String temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }

        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1) {
                res.append(arr[i] + " ");
            } else {
                res.append(arr[i]);
            }
        }

        return res.toString();
    }
}