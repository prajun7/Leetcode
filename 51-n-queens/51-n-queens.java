class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        backtrack(n,res,new ArrayList<String>(),new HashSet<String>());
        return res;
    }
    
    private void backtrack(int n,List<List<String>> res,List<String> temp,Set<String> visited){
        int queenPlaced = temp.size();
        if(queenPlaced == n){
            res.add(new ArrayList(temp));
            return;
        }
        
        for(int j = 0;j < n;j++){
            if(!isAttacked(j,queenPlaced,visited)){
                visited.add(String.format("r%d",queenPlaced));
                visited.add(String.format("c%d",j));
                visited.add(String.format("d1-%d",j-queenPlaced));
                visited.add(String.format("d2-%d",j+queenPlaced));
                temp.add(formatAnswer(n,j));
                backtrack(n,res,temp,visited);
                temp.remove(queenPlaced);
                visited.remove(String.format("r%d",queenPlaced));
                visited.remove(String.format("c%d",j));
                visited.remove(String.format("d1-%d",j-queenPlaced));
                visited.remove(String.format("d2-%d",j+queenPlaced));
            }
        }
        
    }
    
    private boolean isAttacked(int col,int row,Set<String> visited){
        if(visited.contains(String.format("r%d",row))){
            return true;
        }
        
        if(visited.contains(String.format("c%d",col))){
            return true;
        }
        
        if(visited.contains(String.format("d1-%d",col-row))){
            return true;
        }
        
        if(visited.contains(String.format("d2-%d",col+row))){
            return true;
        }
        
        return false;
    }
    
    private String formatAnswer(int totalQueen,int col){
        StringBuilder sb = new StringBuilder();
        for(int j = 0;j<totalQueen;j++){
            if (j != col){
                sb.append(".");
            }else{
                sb.append("Q");
            }
        }
        
        return sb.toString();
    }
}