class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < asteroids.length; i++) {
            boolean isDestroyed = false;

            while(!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0) {
                int top = st.peek();

                if(Math.abs(asteroids[i]) > top) {
                    st.pop();
                } else if(Math.abs(asteroids[i]) < top) {
                    isDestroyed = true;
                    break;
                } else {
                    st.pop();
                    isDestroyed = true;
                    break;
                }
            }

            if(!isDestroyed) st.push(asteroids[i]);
        }

        int res[] = new int[st.size()];

        for(int i = st.size() - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
}