/*
Given a set of N nuts of different sizes and N bolts of different sizes. There is a one-one mapping between nuts and bolts. Match nuts and bolts efficiently.

Comparison of a nut to another nut or a bolt to another bolt is not allowed. It means nut can only be compared with bolt and bolt can only be compared with nut to see which one is bigger/smaller.
The elements should follow the following order ! # $ % & * @ ^ ~ .


*/

class Solution1 {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        char chArr[] = new char[]{'!' , '#' , '$' , '%' , '&' , '*' , '@' , '^' , '~'};
        
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        
        for(char ch : nuts) {
            hs1.add(ch);
        }
        
        for(char ch : bolts) {
            hs2.add(ch);
        }
        
        int idx = 0;
        for(char ch : chArr) {
            if(hs1.contains(ch)) {
                if(hs2.contains(ch)) {
                    nuts[idx++] = ch;
                }
            }
        }
        
        // System.out.println();
        idx = 0;
        for(char ch : chArr) {
            if(hs1.contains(ch)) {
                if(hs2.contains(ch)) {
                    bolts[idx++] = ch;
                }
            }
        }
    }
}