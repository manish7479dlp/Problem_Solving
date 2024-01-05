//Largest subarray with 0 sum
class Solution1
{
    int maxLen(int arr[], int n) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            
            if(sum == 0) maxi = i + 1;
            
            if(hm.containsKey(sum)) {
                maxi = Math.max(maxi , i - hm.get(sum));
            } else {
                hm.put(sum , i);
            }
            
            
            
        }
        
        return maxi == Integer.MIN_VALUE ? 0 : maxi;
    }
    
    
    //TLE
    // int maxLen(int arr[], int n)
    // {
    //     // Your code here
    //     int maxi = Integer.MIN_VALUE;
    //     for(int i = 0; i < n; i++) {
    //         int sum = 0;
    //         for(int j = i; j < n; j++) {
    //             sum += arr[j];
                
    //             if(sum == 0) {
    //                 maxi = Math.max(maxi,(j - i + 1));
    //             }
    //         }
    //     }
        
    //     return maxi == Integer.MIN_VALUE ? 0 : maxi;
    // }
}