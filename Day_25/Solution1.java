*/
Given an array a of length n and a number k, find the largest sum of the subarray containing at least k numbers. It is guaranteed that the size of array is at-least k.
*/


class Solution1 {
    
    public long maxSumWithK(long a[], long n, long k)
    {
        long sum = 0L;
        for(int i = 0; i < k; i++) {
            sum += a[i];
        }
        
        long maxi = sum;
        long psnt = maxi;
        
        for(int i = (int)k; i < n; i++) {
            sum = sum + a[i] - a[i- (int)k];
            psnt = Math.max(psnt + a[i] , sum);
            maxi = Math.max(maxi , psnt);
        }
        
        return maxi;
    }
}