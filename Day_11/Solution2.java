//Container With Most Water

class Solution2 {
    public int maxArea(int[] height) {
        int i = 0 , j = height.length - 1;
        int ans = 0;
        while(i < j) {
            
            if(height[i] > height[j]) {
                int l = j - i;
                int area = height[j] * l;
                ans = Math.max(ans , area);
                 j--;
            } else {
                int l = j - i;
                int area = height[i] * l;
                ans = Math.max(ans , area);
                i++;
            }
        }

        return ans;
    }
}