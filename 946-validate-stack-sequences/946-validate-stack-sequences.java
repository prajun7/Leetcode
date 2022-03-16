class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        
        int j = 0;
        for (int i = 0; i < pushed.length ; i++){
            st.push(pushed[i]);
            while (!st.isEmpty() && j < popped.length && st.peek() == popped[j]){
               // System.out.println(st.peek());
                st.pop();
                j++;
            }

        }
        
        return j == popped.length;
    

    }
}

// class Solution {
//     public boolean validateStackSequences(int[] pushed, int[] popped) {
//         Stack<Integer> st = new Stack<>();
//         int j = 0;
//         for(int p : pushed) {
//             st.push(p);
//             while(!st.isEmpty() && j < popped.length && st.peek() == popped[j]) {
//                 st.pop();
//                 j++;
//             }
//         }
//         return j == popped.length;
//     }
// }
