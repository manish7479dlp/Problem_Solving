//Find element occuring once when all other are present thrice
class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        
        for(int elm : arr) {
            hs.add(elm);
        }
        
        int uniqueSum = 0;
        
        for(int elm : hs) {
            uniqueSum += elm;
        }
        
        int totalArrSum = 0;
        
        for(int elm : arr) {
            totalArrSum += elm;
        }
        
        return (3 * uniqueSum - totalArrSum ) / 2;
    }
}