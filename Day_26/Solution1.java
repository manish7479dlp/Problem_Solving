//Given a collection of Intervals, the task is to merge all of the overlapping Intervals.

class Solution1
{
    public int[][] overlappedInterval(int[][] arr)
    {
        // Code here // Code here
        Arrays.sort(arr , (int[] a , int[] b) -> a[0] - b[0]);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            
            int n = res.size() - 1;
            
            if(res.size() == 0 || (start > res.get(n).get(1)) ) {
              
                ArrayList<Integer> t = new ArrayList<>();
                t.add(start);
                t.add(end);
                res.add(t);
                
                
            }
             else {
                int maxi = Math.max(end , res.get(n).get(1));
                res.get(n).set(1 , maxi);
            }
            
        }
        
        int[][] ans = new int[res.size()][2];
        
          for(int i = 0; i < ans.length; i++) {
              for(int j = 0; j < ans[i].length; j++) {
                  ans[i][j] = res.get(i).get(j);
              }
          }
          
          return ans;
          
    }
}