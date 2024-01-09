//2215. Find the Difference of Two Arrays
class Solution2 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int elm : nums2) {
            if(hm.containsKey(elm) == false)
            hm.put(elm , 1);
        }

        List<Integer> temp = new ArrayList<>();

        for(int elm : nums1) {
            if(hm.containsKey(elm) == false) {
                if(hs.contains(elm) == false) {
                    temp.add(elm);
                    hs.add(elm);
                }
            }
        }

        res.add(temp);

        hm = new HashMap<>();

        for(int elm : nums1) {
            if(hm.containsKey(elm) == false)
            hm.put(elm , 1);
        }

        temp = new ArrayList<>();
        hs = new HashSet<>();

        for(int elm : nums2) {
            if(hm.containsKey(elm) == false) {
                if(hs.contains(elm) == false) {
                    temp.add(elm);
                    hs.add(elm);
                }
            }
        }

        res.add(temp);


        return res;


    }
}