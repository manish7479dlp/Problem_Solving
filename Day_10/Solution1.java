//392. Is Subsequence


class Solution1 {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;

        if(s.length() == 0 ) {
            return true;
        }

        if(t.length() == 0) return false;

        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == s.charAt(idx)) {
                idx++;

                if(idx == s.length()) return true;
            }
        }

        return false;
    }
}