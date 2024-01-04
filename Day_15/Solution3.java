//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
class Solution3 {
    
    public int longestOnes(int[] arr, int k) {
        int s = 0, e = 0;
        int ts=0;
        int te = 0;
        int maxi = Integer.MIN_VALUE;

        boolean flag = true;
        
        for(int i = 1; i < arr.length; i++) {
            int pre = arr[i-1];
            int curr = arr[i];

            if(pre == curr) {
                te = i;
            } else  {
                if(te - ts + 1 > maxi) {
                   maxi = e - ts + 1;
                   s = ts;
                   e = te;
                   ts = i;
                } else {
                    ts = i;
                }
                
            }

            if(arr[i] == 1) {
                flag = false;
            }
        }

        if(flag) {
            return 0;
        }

        if(te - ts + 1 > maxi) {
            maxi = e - ts + 1;
            s = ts;
            e = te;
        }

    //    System.out.println(maxi);
          

          //actual logic.

          int i = 0 , j = s - 1;

          while(i < j && k > 0) {
              if(arr[i] == 1 && arr[j] == 0) {
                  swap(arr , i , j);
                  i++;
                  j--;
                  k--;
              } else if(arr[i] == 0) {
                  i++;
              } else {
                  j--;
              }
          }

          i = e + 1;
          j = arr.length - 1;

          while(k > 0 && i < j) {
              if(arr[i] == 0 && arr[j] == 1) {
                  swap(arr , i , j);
                  i++;
                  j--;
                  k--;
              } else if(arr[i] == 1 ) {
                  i++;
              } else {
                  j--;
              }
          }


          ////


         maxi = 0;
         int cnt = arr[0] == 1 ? 1 : 0;
        
        for(int ii = 1; ii < arr.length; ii++) {
            int pre = arr[ii-1];
            int curr = arr[ii];

            if(arr[ii] == 1 && pre == curr) {
                cnt++;
            } else  {
                if(cnt > maxi) {
                    maxi = cnt;
                }
                    cnt = arr[ii] == 1 ? 1 : 0;
            }
                

            // System.out.println(maxi);
        }

        if(cnt > maxi) {
            maxi = cnt;
            cnt = 1;
        }

        System.out.println(s + " " + e);


        for(int elm : arr) {
            System.out.print(elm + " ");
        }

        
          return maxi;
    }

    public void swap(int[] arr , int lo , int hi) {
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }
}