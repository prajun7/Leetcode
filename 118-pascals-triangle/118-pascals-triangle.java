class Solution {
    public List<List<Integer>> generate(int numRows) {
        
    ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
    // Should be in this format
    // ArrayList< ArrayLis<Integer>> res = new ArrayList< ArrayLis<Integer>>();
    // Won't work?
        
        List<Integer> eachRow, prevRow = null;
    // Just like declaring, int i = 0;
        
        for (int i = 0; i < numRows; i++ ){
            
            eachRow = new ArrayList<>();
    // Each time need to create the rows
            
            for (int j = 0; j <= i; j ++){
    // This for loop will go until j is equal to i 
    // if i =2, that is the third row, than j should run 3 
                //times to get those 3 elements
            
                if (j==0 || j == i){   // First and last element are 1
                    eachRow.add(1);
                }
                
                else{
                    eachRow.add(prevRow.get(j-1)+prevRow.get(j));
    //Else just add the previous numbers which was stored in prevRow 
                }
            } // end of inner for loop
            
            res.add(eachRow);
            prevRow = eachRow;
    // so, that the prevRow will get updated
            
        }// end of outer for loop
        
        return res;
    
        
    }
}