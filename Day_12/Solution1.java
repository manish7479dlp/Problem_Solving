//Factorials of large numbers
class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        int carry = 0;
        
        for(int i = 2; i <= N; i++) {
            for(int j = 0; j < res.size();j++) {
                int tmp = res.get(j) * i +  carry;
                res.set(j , tmp % 10);
                carry = tmp / 10;
            }
            
            while(carry > 0) {
                res.add(carry % 10);
                carry /= 10;
            }
            
            carry = 0;
        }
        
        Collections.reverse(res);
        
        return res;
    }
}