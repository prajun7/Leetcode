class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> valid = new Stack();
        char[] charArray = s.toCharArray();
        
        for (char ch : charArray){
            
            if (ch == '(' || ch == '{' || ch == '['){
                valid.push(ch);
            }
            
            else{
                
                if (valid.isEmpty() == true){
                    return false;

                }
                
                if (ch == ')' && valid.peek() == '('  ||
                    ch == '}' && valid.peek() == '{'  ||
                     ch == ']' && valid.peek() == '['  
                   ){
                    valid.pop();
                }
                else{
                    return false;

                }
                
                
            }
            
        }
        
        if (valid.isEmpty() == true){
            return true;
        }
        else{
          return false;
        }
        
    }
}