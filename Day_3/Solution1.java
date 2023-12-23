//Count More than n/k Occurences

class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        HashMap<Integer , Integer> hm = new HashMap<>();
        
        for(int elm : arr) {
            if(hm.containsKey(elm)) {
                hm.put(elm , hm.get(elm) + 1);
                continue;
            }
            hm.put(elm , 1);
        }
        
        
        int target = n / k;
        int cnt = 0;
        
        for(int elm : hm.keySet()) {
            
            if(hm.get(elm) > target) {
                cnt++;
            }
        }
        
        return cnt;
    }
}
