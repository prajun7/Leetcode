// https://www.youtube.com/watch?v=B6THIJXrTLs

class Solution {
    // TC : O(n)
    // SC : O(n)
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] pathList = path.split("/");  // split by backslash character

        for(String p : pathList){
            if(p.length() == 0 || p.equals(".")){  // if p is empty just continue
                continue;
            } else if(p.equals("..")){   // if two dots, pop from the stack
                if(!st.empty()){
                    st.pop();
                }
            } else {      
                // string case
                st.push(p);
            }
        }
        
        // StringBuilder
        String ans = "";
        while(!st.empty()){
            ans =st.pop() +"/"+ ans;
        }
        if(ans.length() == 0){
            return "/";
        }else{                      // add the end we need to add backslash at the end
            return "/" + ans.substring(0, ans.length() -1);
        }
    }
}