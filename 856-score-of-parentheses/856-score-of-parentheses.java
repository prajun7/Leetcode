// https://www.youtube.com/watch?v=jfmJusJ0qKM

/*
The idea is to whenever we see opening parentheses, just push the score into the stack.
After pushing that score, make the score again to 0 for the next pari
If we see a closing parentheses, just pop the score and do the max of (score *2 or 1)

Dry run for,
((()()))

1. for (
Stack [0] , score = 0

2. for (
Stack [0,0] , score = 0

3. for (
Stack [0,0,0] , score = 0

4. for )
Stack [0,0] , score = 0 + Math.max(0*2, 1) = 1, so score = 1

5. for (
Stack [0,0,1] , score = 0

.... Watch the above video

*/

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        
        for (char c: s.toCharArray()){
            if (c == '('){
                st.push(score);
                score = 0;
            }else{
                score = st.pop() + Math.max(score * 2, 1);
            }
        }
        
        return score;
        
    }
}