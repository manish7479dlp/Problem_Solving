//Maximum of all subarrays of size k
class Solution2
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        // int maxi = Integer.MIN_VALUE;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k; i++) {
            pq.offer(arr[i]);
        }
        
        int maxi = pq.peek();
        result.add(maxi);
        int idx = 0;
        for(int i = k; i < n; i++) {
            pq.remove(arr[idx++]);
            pq.offer(arr[i]);
            result.add(pq.peek());
        }
        
        return result;
    }
}