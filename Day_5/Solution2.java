//Count Occurences of Anagrams
class Solution {

    int search(String pat, String txt) {
        // code here
        
        HashMap<Character,Integer> ansMap = new HashMap<>();
        
        for(char ch : pat.toCharArray()) {
            if(ansMap.containsKey(ch)) {
                ansMap.put(ch , ansMap.get(ch) + 1);
            } else {
                ansMap.put(ch , 1);
            }
        }
        
        int i = 0 , j = 0 , ans = 0;
        int n = txt.length();
        int k = pat.length();
        
        HashMap<Character , Integer> tempMap = new HashMap<>();
        
        while(j < n) {
            char ch = txt.charAt(j);
            if(tempMap.containsKey(ch)) {
                tempMap.put(ch , tempMap.get(ch) + 1);
            } else {
                tempMap.put(ch , 1);
            }
            
            if(j - i + 1 == k) {
                if(tempMap.equals(ansMap)) {
                    ans++;
                }
                
                tempMap.put(txt.charAt(i) , tempMap.get(txt.charAt(i)) - 1);
                
                if(tempMap.get(txt.charAt(i)) == 0) {
                    tempMap.remove(txt.charAt(i));
                }
                i++;
                
            }
            j++;
        }
        
         return ans;
        
        
    }
}