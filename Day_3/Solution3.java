// 345. Reverse Vowels of a String


class Solution {
    public boolean isVovel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }

    public void swap(char[] arr , int x , int y) {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public String reverseVowels(String s) {
        int lo = 0 , hi = s.length() - 1;
        char[] carr = s.toCharArray();

        while(lo < hi) {
            char left = carr[lo];
            char right = carr[hi];

            if(isVovel(left) && isVovel(right)) {
                swap(carr , lo , hi);
                lo++;
                hi--;
            } else if(isVovel(left)) {
                hi--;
            } else {
                lo++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(carr);
        return sb.toString();

        // return "";
    }
}