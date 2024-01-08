//Maximum Index
class Solution1 {

    int maxIndexDiff(int arr[], int n) {
        // code here
        int[] right = new int[n];
        int idx =  n - 1;
        
        for(int i = n - 1; i >= 0; i--) {
            if(arr[idx] < arr[i]) {
                idx = i;
            }
            right[i] = idx;
        }
        
        int start = 0;
        int k = 0 , i = 0;
        
        while(i < n) {
            while(i < n && arr[start] <= arr[right[i]]) {
                i++;
            }
            
            k = Math.max(k , right[i-1] - start);
            start++;
        }
        
        return  k;
    }
}