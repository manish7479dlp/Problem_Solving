// 1768. Merge Strings Alternately
class Day1 {
    public String mergeAlternately(String word1, String word2) {
        int i = 0 , j = 0;
        StringBuilder res = new StringBuilder();

        while(i < word1.length() && j < word2.length()) {
            String data = word1.charAt(i) + "" + word2.charAt(j);
            i++;
            j++;
             res.append(data);
        }

        while(i < word1.length()) {
             res.append(word1.charAt(i));
            i++;
        }

        while(j < word2.length()) {
             res.append(word2.charAt(j));
            j++;
        }

        return res.toString();
    }
}