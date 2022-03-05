class Solution {
    public int rob(int[] nums) {
        
        if (nums == null || nums.length == 0){
            return 0;
        }
        
        if (nums.length == 1){
            return nums[0];
        }
        
        if (nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        
        int[] dp = new int[nums.length];
        dp[0] = nums[0];  // for the first house
        dp[1] = Math.max(nums[0], nums[1]);   //For the second house, the dp[1] is the 
                     //max between first or second house
         
   // [ #,#,#]
        
        for (int i = 2; i < nums.length ; i++){
            // write for third house
            // For third house, we need to choose either,
            // money from first house and third house or,
            // money from just second house,
            // We will pick max of these two
            
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }
        
        return dp[nums.length-1];
        
    }
}