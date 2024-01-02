//643. Maximum Average Subarray I

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int i = 1 , j = k + 1;
        int sum = 0;
        double maxi = -999999.00;
        for(int i = 0; i < k; i++) {
            sum+= nums[i];
        }

        maxi = Math.max(maxi , (sum *1d / k));
        
        // System.out.println(sum * 1d / k);
        // System.out.println(maxi > -1);

        int j = 0;
        for(int i = k; i < nums.length; i++) {
             sum -= nums[j];
             j++;
             sum+= nums[i];
             maxi = Math.max(maxi , (sum *1d / k));
        }
      // System.out.println(maxi);
        return maxi;


    }
}