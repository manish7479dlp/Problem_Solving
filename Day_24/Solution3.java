*/

Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

*/
class Solution3 {
    public boolean closeStrings(String word1, String word2) {
        int[] h1 = new int[26];
        int[] h2 = new int[26];

        boolean[] c1 = new boolean[26];
        boolean[] c2 = new boolean[26];



        for(char ch : word1.toCharArray()) {
             h1[ch - 'a']++;
             c1[ch - 'a'] = true;
        }

        for(char ch : word2.toCharArray()) {
             h2[ch - 'a']++;
             c2[ch - 'a'] = true;
        }

        Arrays.sort(h1);
        Arrays.sort(h2);

        // if(!Arrays.equals(h1 , h2)) {
        //     return false;
        // }

        return Arrays.equals(h1 , h2) && Arrays.equals(c1 , c2);
    }
}