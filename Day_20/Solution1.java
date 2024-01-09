//
Sum of Middle Elements of two sorted arrays
class Solution1 {
    
    int[] merge(int[] arr1 , int[] arr2) {
        int i = 0 , j = 0;
        int[] res = new int[arr1.length + arr2.length];
        int idx = 0;
        
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] > arr2[j]) {
                res[idx] = arr2[j];
                j++;
            } else {
                res[idx] = arr1[i];
                i++;
            }
            idx++;
        }
        
        while(i < arr1.length) {
            res[idx] = arr1[i];
            i++;
            idx++;
        }
        
        while(j < arr2.length) {
            res[idx] = arr2[j];
            j++;
            idx++;
        }
        
        
        
        return res;
    }
    
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        
        int[] res = merge(ar1 , ar2);
        
        
        
        if(res.length % 2 == 0) {
            int f = res.length / 2;
            int s = f - 1;
            
            return res[f] + res[s];
        } else {
            return res[res.length / 2];
        }
    }
}