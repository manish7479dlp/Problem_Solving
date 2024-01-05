//1493. Longest Subarray of 1's After Deleting One Element
class Solution {
    public int left1(int arr[] , int l) {
        int cnt = 0;
        while(l >= 0) {
            if(arr[l] == 1) {
                cnt++;
                l--;
            } else {
                break;
            }
        }

        return cnt;
    }

    public int right1(int arr[] , int r) {
        int cnt = 0;
        while(r < arr.length) {
            if(arr[r] == 1) {
                cnt++;
                r++;
            } else {
                break;
            }
        }

        return cnt;
    } 


    public int longestSubarray(int[] arr) {
         int maxi = Integer.MIN_VALUE;

         boolean flag = true;

         for(int i = 0; i< arr.length; i++) {
             if(arr[i] == 0) {
                 int l = left1(arr , i - 1);
                 int r = right1(arr , i + 1);
                 maxi = Math.max(maxi , r + l);

                 if(arr[i] == 0) {
                     flag = false;
                 }
             }
         } 

         if(flag) {
             return arr.length - 1;
         }

         return maxi == Integer.MIN_VALUE ? 0 : maxi;   
    }
}