/*
Given two arrays A and B contains integers of size N and M, the task is to find numbers which are present in the first array, but not present in the second array.
*/

class Solution2
{
    ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        ArrayList<Long> result = new ArrayList<>();
        
        HashSet<Long> hs = new HashSet<>();
        
        for(long elm : B) {
            hs.add(elm);
        }
        
        for(long elm : A) {
            if(!hs.contains(elm)) {
                result.add(elm);
            }
        }
        
        return result;
    }
}