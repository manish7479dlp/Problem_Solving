//1679. Max Number of K-Sum Pairs

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int lo = 0 , hi = nums.length - 1;
        int cnt = 0;
        while(lo < hi) {
            if(nums[lo] + nums[hi] == k) {
                cnt++;
                lo++;
                hi--;
            } else if(nums[lo] + nums[hi] > k) {
                hi--;
            } else {
                lo++;
            }
        }

        return cnt;
    }
}