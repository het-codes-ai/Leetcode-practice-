class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int n : asteroids) {
            if (st.isEmpty()) {
                st.push(n);
            }
            else if ((n > 0 && st.peek() > 0) || (n < 0 && st.peek() < 0)) {
                st.push(n);
            }
            else {
                boolean alive = true;

                while (!st.isEmpty() && n < 0 && st.peek() > 0) {
                    if (Math.abs(st.peek()) > Math.abs(n)) {
                        alive = false;
                        break;
                    }
                    else if (Math.abs(st.peek()) == Math.abs(n)) {
                        st.pop();
                        alive = false;
                        break;
                    }
                    else {
                        st.pop();
                    }
                }

                if (alive) {
                    st.push(n);
                }
            }
        }

        int[] ans = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}
