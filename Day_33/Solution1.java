/*
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.


*/

class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == ']') {
                StringBuilder sb = new StringBuilder();
                String x = "";
                while(!st.peek().equals("[") ) {
                //   sb.append(st.pop());
                     x = st.pop() + x;
                }
                //   System.out.println(sb.toString());
                st.pop();
                StringBuilder sts = new StringBuilder();

                while(!st.isEmpty() && (st.peek().charAt(0) >= '0' && st.peek().charAt(0) <= '9')) {
                      sts.append(st.pop());
                }
                int val = Integer.parseInt(sts.reverse().toString());
                // String str = sb.reverse().toString();
                StringBuilder temp = new StringBuilder();
                for(int i = 1; i <= val; i++) {
                    temp.append(x);
                }
                st.push(temp.toString());
            } else {
                st.push(ch + "");
            }
        }

        // StringBuilder result = new StringBuilder();

        // System.out.println(st.peek());

        String result = "";
        
        while(!st.isEmpty()) {
            // result.append(st.pop());

            result = st.pop() + result;
        }

        // return result.toString();

        return result;


        // return st.peek();

    }
}