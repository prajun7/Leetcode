class Solution {
    
    // https://www.youtube.com/watch?v=thL70BR3yMA
    
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;   //Keep track of open paranthesis
        
        for (char ch : s.toCharArray()){
            if (ch == '('){
                open++;
            }
            else if(ch == ')'){
                if (open == 0) continue;
                open--;
            }
            sb.append(ch);
            
            }
        
        if (open == 0){
            return sb.toString();
        }
        
        // If open is not 0, that means we have extra open brackets
        // So, we will remove that open brackets by itereting from the back of sb
        StringBuilder result = new StringBuilder();
        for (int i = sb.length()-1; i >= 0 ; i--){
            if (sb.charAt(i) == '(' && open-- > 0) continue;
            result.append(sb.charAt(i));
        }
    
        return result.reverse().toString();   //Since the stings gets reversed, we need to reverse it
        
    }  
}
