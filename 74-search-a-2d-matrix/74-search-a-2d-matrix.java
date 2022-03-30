class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        
        //Search element form top rigth index.
        int i = 0;
        int j = columnLength -1;
        while (i < rowLength && j >= 0 ){
                if (matrix[i][j] == target){
                    return true;
                }
                else if(matrix[i][j] < target){
                    i = i+1;  // if target is greater search in the lower rows
                }
                else{
                    j = j-1;  // If target is smaller search in same row but different column.
                }
                
            }
        return false;
        
    }
}