//1614. Maximum Nesting Depth of the Parentheses

class Solution3 {
    public int maxDepth(String s) {
        int cnt = 0;
        int maxi = 0;
        for(int i= 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '('){
                cnt++;
            } else if(ch == ')') {
                cnt--;
            }

            maxi = Math.max(maxi , cnt);
        }

        return maxi;


    }
}