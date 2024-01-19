//valid substring

class Solution1 {
  
    
      static int findMaxLen(String S) {
        // code here
        Stack<Integer> s= new Stack<>();
        int ans=0;
        s.push(-1);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='(') s.push(i);
            else{ 
                if(!s.isEmpty()) s.pop();
            
                if(s.isEmpty())s.push(i);
                
                else ans=Math.max(i-s.peek(),ans);
            }
        }
        return ans;
    }
};