//3. Longest Substring Without Repeating Characters


class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int l = 0;
        int ans = 0;

        for(int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            if(!hs.contains(ch)) {
                hs.add(ch);
                ans = Math.max(ans , hs.size());
            } else {
                while(s.charAt(l) != ch) {
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.remove(s.charAt(l));
                l++;
                hs.add(ch);
            }
        }

        return ans;
    }
}