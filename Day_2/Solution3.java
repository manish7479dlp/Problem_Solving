// 1071. Greatest Common Divisor of Strings

class Solution3 {

   public int hcf(int n1 , int n2) {
       int min = n1 > n2 ? n2 : n1;

       for(int i = min; i >= 1; i--) {
           if(n1 % i == 0 && n2 % i == 0) {
               return i;
           }
       }
       return 1;
   }

    public String gcdOfStrings(String str1, String str2) {
        
        String t1 = str1 + str2;
        String t2 = str2 + str1;
        int x = hcf(str1.length() , str2.length());
        if(t1.equals(t2)) {
            return str1.substring(0 , x);
        } else {
            return "";
        }
    }
}