// Today is matchday 2 and it is between the most loved team Chennai Super Kings and the most underrated team - Punjab Kings. Stephen Fleming, the head coach of CSK, analyzing the batting stats of Punjab. He has stats of runs scored by all N players in the previous season and he wants to find the maximum score for each and every contiguous sub-list of size K to strategize for the game.
class Solution {
    // static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
    //     // Your code here
    //     Stack<Integer> st = new Stack<>();
    //     st.push(n - 1);
        
    //     int[] fre = new int[n];
        
    //     fre[n - 1] = n; 
        
    //     for(int i = n - 2; i >= 0; i--) {
            
    //         while(st.size() > 0 && arr[st.peek()] <= arr[i]) {
    //             st.pop();
    //         }
            
    //         if(st.size() == 0) {
    //             fre[i] = i;
    //         } else {
    //             fre[i] = st.peek();
    //         }
            
    //         st.push(i);
            
    //     }
        
    //     // for(int elm : fre) {
    //     //     System.out.print(elm + " ");
    //     // }
        
        
        
    //     // System.out.println();
        
    //     ArrayList<Integer> result = new ArrayList<>();
        
    //     for(int i = 0; i <= n - k; i++) {
            
    //         int j = i;
            
    //         while(fre[j] < (k + i)) {
    //             j = fre[j];
    //         }
            
    //         result.add(arr[j]);
    //     }
        
    //     return  result;
    // }
    
     static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
       

        ArrayList<Integer> ars=new ArrayList<Integer>();
        Deque<Integer> dq=new LinkedList<Integer>();
        for(int i=0; i<n; i++){
         while(!dq.isEmpty() && dq.peekFirst()==i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]<arr[i]){
                dq.pollLast();
            }
             dq.addLast(i);
            if(i>=k-1){
                ars.add(arr[dq.peekFirst()]);
            }
        }
       return ars;
      }
}