//1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<Boolean>();
        int maxi = Integer.MIN_VALUE;
        for(int elm : candies) {
            if(maxi < elm) {
                maxi = elm;
            }
        }

        for(int i = 0; i < candies.length; i++) {
            res.add(candies[i] + extraCandies >= maxi ? true : false);
        }

        return res;
    }
}