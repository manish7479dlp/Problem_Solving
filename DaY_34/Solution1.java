
// 933. Number of Recent Calls


class Solution1 {
    private Queue<Integer> requests;
    public Solution1() {
       this.requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        requests.add(t);
        while (requests.peek() < t - 3000) {
            requests.poll();
        }
        return requests.size();
    }
}

