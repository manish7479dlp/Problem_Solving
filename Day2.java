//Recursively remove all adjacent duplicates
class Day2{
    String rremove(String s) {
        if(s.isEmpty()) return s;
        StringBuilder ans = new StringBuilder();
        helper(ans, s);
        return ans.toString();
    }
    
      void helper(StringBuilder sb, String s){
        boolean [] adjacentFlag = new boolean[s.length()];
        //tag adjacent as true;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i -1) == s.charAt(i)){
                adjacentFlag[i] = adjacentFlag[i - 1] =true;
            }
        }
      
        StringBuilder rem = new StringBuilder();
        //find remaing elements not tagged as true
        for(int i =0 ;i< adjacentFlag.length; i++){
            if(!adjacentFlag[i]) rem.append(s.charAt(i));
        }
      
        //0 Adjacent element(s) exist, return!
        if(rem.length() == s.length()){
            sb.append(s);
            return;
        }
        helper(sb, rem.toString());
    }


}