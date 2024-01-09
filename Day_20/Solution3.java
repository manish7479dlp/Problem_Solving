//1207. Unique Number of Occurrences
class Solution3 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int elm : arr) {
            if(hm.containsKey(elm)) {
                hm.put(elm , hm.get(elm) + 1);
            } else {
                hm.put(elm , 1);
            }
        }

        HashSet<Integer> hs  = new HashSet<>();

        for(int key : hm.keySet()) {
            if(hs.contains(hm.get(key))) {
                return false;
            } else {
                hs.add(hm.get(key));
            }
        }

        return true;
    }
}