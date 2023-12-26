//238. Product of Array Except Self
class Solution3 {
    public int[] productExceptSelf(int[] nums) {
        int[] rm = new int[nums.length];
        rm[nums.length - 1] = 1;

        //calculate right multiple
        for(int i = nums.length - 2; i >= 0; i--) {
            rm[i] = rm[i + 1] * nums[i + 1];
        }
        int lm = 1;

        int[] res = new int[nums.length];

        // actual logic

        for(int i = 0; i < nums.length; i++) {
            int temp = rm[i] * lm;
            res[i] = temp;
            lm *= nums[i];
        }

        return res;
    }
}