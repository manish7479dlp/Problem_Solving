//Find element occuring once when all other are present thrice
class Solution1 {
    
    static int fidx(int[] arr , int elm) {
        int lo = 0 , hi = arr.length - 1;
        int ans = -1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            
            if(arr[mid] == elm) {
                ans = mid;
                hi = mid - 1;
            } else if(arr[mid] < elm) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        return ans;
    }
    
    static int lidx(int[] arr , int elm) {
        int lo = 0 , hi = arr.length - 1;
        int ans = -1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            
            if(arr[mid] == elm) {
                ans = mid;
                lo = mid + 1;
            } else if(arr[mid] < elm) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        
        return ans;
    }
    
    static int singleElement(int[] arr , int N) {
        Arrays.sort(arr);
        
        for(int i = 0; i<N; i++) {
            int elm = arr[i];
            int f = fidx(arr , elm);
            int l = lidx(arr , elm);
            
            if((f - l + 1) == 1) {
                return elm;
            } else {
                i = l;
            }
        }
        
        return -1;
    }
    
    // static int singleElement(int[] arr , int N) {
    //     // code here
    //     Arrays.sort(arr);
    //     HashMap<Integer,Integer> hm = new HashMap<>();
        
        
    //     for(int i = 0; i < N; i++) {
    //         if(hm.containsKey(arr[i])) {
    //             hm.put(arr[i] , hm.get(arr[i]) + 1);
    //         } else {
    //             hm.put(arr[i] , 1);
    //         }
            
            
    //     }
        
    //     for(int key : hm.keySet()) {
    //         if(hm.get(key) == 1) {
    //             return key;
    //         }
    //     }
        
    //     return -1;
    // }
}