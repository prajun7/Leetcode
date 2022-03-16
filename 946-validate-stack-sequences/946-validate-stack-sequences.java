// https://www.youtube.com/watch?v=SeTsK_aNUWI

/*
The idea is to push the element of pushed array inside tha stack.
And after pushing we need to check each time, if theh peek of the stack is
equal to the element of the popped array. If it is equal we just pop that number from the stack.
if the j pointer reaches till the end of the array, that means we return true.
Another way to check if, the stack is empty or not.
If the stack is empty we return true else false.
*/

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        
        int j = 0;
        for (int i = 0; i < pushed.length ; i++){
            st.push(pushed[i]);
            while (!st.isEmpty() && j < popped.length && st.peek() == popped[j]){
                st.pop();
                j++;
            }
        }
        
       // return j == popped.length;
        return st.isEmpty();
    

    }
}
