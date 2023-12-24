//Longest K unique characters substring

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int res = -1;
        HashMap<Character , Integer> hm = new HashMap<>();
        int i = 0 , j = 0;
        
        while(j < s.length()) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            
            if(hm.containsKey(cj)) {
                hm.put(cj , hm.get(cj) + 1);
            } else {
                hm.put(cj , 1);
            }
            
            if(hm.size() == k) {
                if((j-i + 1) > res) {
                    res = j - i + 1;
                }
            } else if(hm.size() > k) {
                
                while(hm.size() > k) {
                       char c = s.charAt(i);
                        hm.put(c , hm.get(c) - 1);
                        i++;
                        
                        if(hm.get(c) == 0) {
                            hm.remove(c);
                            // break;
                        }
                    
                    
                    
                }
                
                //  if(hm.size() == k) {
                //     if((j-i +1) > res) {
                //         res = j - i + 1;
                //     }
                // }
                
            }
            // System.out.println(res);
            j++;
        }
        
        return res;
    }
}