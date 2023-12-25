//605. Can Place Flowers

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int k) {
        int fpc = 0;
        int n = flowerbed.length;
        for(int i= 0; i < n; i++) {
            int val = flowerbed[i];

            int nm1 = i == 0 ? 0 : flowerbed[i-1];
            int np1 = i == n - 1 ? 0 : flowerbed[i + 1];

            if(val == 0) {
                if(nm1 == 0 && np1 == 0) {
                    flowerbed[i] = 1;
                    fpc++;
                }
            }
        }

        return fpc >= k;
    }
}