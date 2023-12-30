//Winner of an election
class Solution2
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String , Integer> hm = new HashMap<>();
        for(String str : arr) {
            if(hm.containsKey(str)) {
                hm.put(str , hm.get(str) + 1);
            } else {
                hm.put(str , 1);
            }
        }
        
        // ArrayList<String> temp = new ArrayList<>();
        int maxi = 1;
        String t = arr[0];
        
        for(String key : hm.keySet()) {
            if(hm.get(key) == maxi) {
                // temp.add(hm.get(key));
                if(t.compareTo(key) > 0) {
                    t = key;
                }
                
            } else if(hm.get(key) > maxi) {
                t = key;
                maxi = hm.get(key);
            }
        }
        
        String[] res = new String[2];
        res[0] = t;
        res[1] = maxi + "";
        
        return res;
    }
}