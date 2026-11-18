class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[asteroids.length];
        for(int i = 0; i < asteroids.length; i++){
            if(st.empty()){
                st.push(asteroids[i]);
            }
            else{
                while(!st.empty()){
                    if(asteroids[i] < 0 && st.peek() > 0){
                        int x = st.peek();
                        int y = asteroids[i] * -1;
                        if(x < y){
                            st.pop();
                        }
                        else if(x == y){
                            st.pop();
                            break;
                        }
                        else{
                            break;
                        }
                    }
                    else{
                        st.push(asteroids[i]);
                        break;
                    }
                    if(st.empty()){
                        st.push(asteroids[i]);
                        break;
                    }
                }
            }
        }
        arr = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
            arr[i] = st.pop();
        }

        return arr;
    }
}