//Arranging the array

class Solution1 {
    
    public void Rearrange(int arr[], int n)
    {
        // Your code goes here
        int idx = 0;
        int[] temp = new int[n];
        
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }
        
        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}