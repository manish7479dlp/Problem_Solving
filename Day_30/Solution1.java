// Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.

// NOTE: Prefix and suffix can be overlapping but they should not be equal to the entire string.

class Solution {
    
     int lps(String s) {
        int n=s.length();
int[] sp=new int[n];
int i=0;
int j=1;
while(j<n){
    if(s.charAt(i)==s.charAt(j)){
        sp[j]=i+1;
        i++;
        j++;
    }
    else{
        if(i!=0){
            i=sp[i-1];
        }else{
            sp[i]=0;
            j++;
        }
    }
}
return sp[n-1];
    }
    
    // int lps(String s) {
        
        
    //     int n = s.length();
	    
	   // for(int i = 1; i < n; ++i) 
	   //     if(s.charAt(0) == s.charAt(i))
	   //        if(s.substring(0, n - i).equals( s.substring(i)))
	   //           return n - i;
	    
	   // return 0;
        
    //     // code here
    // //     HashMap<String , Integer> hm = new HashMap<>();
    // //     for(int i = 0; i < s.length(); i++) {
    // //         StringBuilder sb = new StringBuilder();
    // //         for(int j = i; j < s.length(); j++) {
    // //             char ch = s.charAt(j);
    // //             sb.append(ch);
    // //             if(hm.containsKey(sb.toString())) continue;
    // //             hm.put(sb.toString() , i);
    // //         }
            
    // //         break;
    // //     }
        
    // // //   for(String key : hm.keySet()) {
    // // //       System.out.println(key + " " + hm.get(key));
    // // //   }
    
   
        
    // //     int ans = 0;
    // //     int n = s.length();
        
    // //     for(String key : hm.keySet()) {
    // //         StringBuilder sb = new StringBuilder();
            
    // //         String substr = s.substring(n - key.length() , n);
            
    // //         // System.out.println(substr);
    // //         if(hm.containsKey(substr) && (key.length() != n)) {
    // //                 ans = Math.max(ans , substr.length());
    // //          }
            
    // //     }
        
    //     // return ans;
        
        
    // }
}