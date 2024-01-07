//724. Find Pivot Index
class Solution1 {
    public int pivotIndex(int[] nums) {
        int rs = 0;
        for(int elm : nums) {
            rs += elm;
        }
        int ls = 0;

        for(int i = 0; i < nums.length; i++) {
            rs -= nums[i];
            if(ls == rs) {
                return i;
            } else {
                ls += nums[i];
            }
        }
        return -1;
    }
}