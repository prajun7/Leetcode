class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        //Initializing the dp array to store the sum
        int[] dp = new int[triangle.size()+1];
        
        //Starting the loop from the size of the triangle
        //Since we want the bottom left element of the triangle
        for(int i=triangle.size()-1;i>=0;i--){
            
             for(int j=0;j<triangle.get(i).size();j++){
                 //Another for loop to loop through the bottom row
                 
                 dp[j] = Math.min(dp[j],dp[j+1]) + triangle.get(i).get(j);
                 //Getting the minimum of the two arrays
                 //and adding to the element at that point
            }
        }
    return dp[0]; // first index of the array will have the minimum sum
            
    }
}