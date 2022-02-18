class Solution {
    public String removeKdigits(String num, int k) {
        /*
        Algorithm :
        Greedy Approach
        
        1. Put all the numbers into the stack
        2. And, check if the next number from the String num is less than the top element of the stack then,
        // remove the previous element(that is top element) from the stack
        3. In stack we are only storing the number which is less than the top element until k reaches 0
        that is a greedy approach
        
        */
        
        int len = num.length();
        // corner case
        // If k is equal to length of the num, return 0
        if(k==len)        
            return "0";
            
        Stack <Character> stack = new Stack<> ();
        
        int i = 0;
        while(i < num.length()){
            //whenever meet a digit which is less than the previous digit, discard the previous one
            //stack.peek looks at the top element and if that is greater than the num.charAt(i) then
            // we don't need that element as we want the minimum possible digits
            while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            
            stack.push(num.charAt(i));
            i++;
        }
        
        // corner case like "1111" 
        // 1. in case of 11111 (duplicate)
        // 2. in case of 12345 (ascending order number)
        //  In this two case, the above while loop won't execute, so we need this while loop
        while(k>0){
            stack.pop();
            k--;            
        }
        
        //construct the number from the stack
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty())
            sb.append(stack.pop());
        
        sb.reverse();  //Need to reverse, as stack reverser the number
        
        //remove all the 0 at the head
        
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        
        return sb.toString();   //finally convert the String Builder to String and return
    }
}
