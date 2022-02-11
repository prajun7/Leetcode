class Solution {
    // Prefix sum problem
    
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hMap = new HashMap<>();
        
        int count = 0;
        int prefixSum = 0;
        for (int i = 0; i < nums.length ; i++){
            prefixSum += nums[i];
            int diff = prefixSum - k;
            
            if (prefixSum == k) count++;
            
            if (hMap.containsKey(diff)){
                count+= hMap.get(diff);
            }
            hMap.put(prefixSum, hMap.getOrDefault(prefixSum,0) + 1);
            
        }
        return count;
        
    }
}
