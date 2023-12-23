//Max sum in the configuration


class Solution2
{
    int max_sum(int arr[], int n)
    {
	// Your code here
	   int res = 0 , sum = 0 , max = 0;
	   
	   for(int i = 0; i < n; i++) {
	       res += i * arr[i];
	       sum += arr[i];
	   }
	   max = res;
	   
	   for(int i = 0; i < n; i++) {
	       res = res + arr[i] * n - sum;
	       max = Math.max(res , max);
	   }
	   return max;
    }	
}