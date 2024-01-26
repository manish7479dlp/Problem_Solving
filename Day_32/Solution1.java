/*

We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.


*/

class Solution1 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int ast : asteroids){
            boolean destroy = false; // Initially, NO COLLISION...
            if(ast > 0){
                st.push(ast); // +ve k case mein...
            }
            else{ // -ve k case jb collision nhi hua h...
                if(st.empty() || st.peek() < 0){
                    st.push(ast);
                }
                else{ // COLLISION...
                    while(!st.empty() && st.peek() > 0){
                        if(Math.abs(ast) == st.peek()){
                            destroy = true;
                            st.pop();
                            break;
                        }
                        else if(Math.abs(ast) > st.peek()){
                            st.pop();
                        }
                        else{
                            destroy = true;
                            break;
                        }
                    }
                    if(!destroy){
                        st.push(ast);
                    }
                }
            }
        }

        int[] result = new int[st.size()];

        int idx = result.length - 1;

        while(!st.isEmpty()) {
            result[idx--] = st.pop();
        }

        return result;
    }
}