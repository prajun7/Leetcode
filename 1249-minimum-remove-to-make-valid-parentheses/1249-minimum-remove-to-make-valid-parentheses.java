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
        
        StringBuilder result = new StringBuilder();
        for (int i = sb.length()-1; i >= 0 ; i--){
            if (sb.charAt(i) == '(' && open-- > 0) continue;
            result.append(sb.charAt(i));
        }
    
        return result.reverse().toString();
        
    }  
}
