class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        for (int i = 2; i < cost.length; i++){
            cost[i] = cost[i] + Math.min(cost[i-1] , cost[i-2]);
        }
        return Math.min(cost[cost.length-1], cost[cost.length - 2]);
        //This return the minimum between last two elements
    	//[10,15,20] after for loop this array becomes,
    	//[10,15,30] and we will return 15
        
    }
}