class Solution {
    public int findMaxLength(int[] nums) {
        // In the hashMap we are storing the count, that is the sum and then the index of that count
        // <count,index>
    	Map<Integer, Integer> map = new HashMap<>();
    	int maxlen = 0, count = 0;
        
    	for(int i = 0;i < nums.length;i++) {
            // If nums[i] is equal to 1, add 1 to the count
            if (nums[i] == 1){
                count += 1;
            }else{   //if nums[i] is equal to 0, subtract 1 from the count
                count += -1;
            }
            
        // Array from index 0 to i contains equal number of 0's and 1's
    		if(count == 0)
    			maxlen = Math.max(maxlen, i+1);  
            
        //means that we found a subarray which doesn't starts form index 0
        // it is a subarray in the middle of the aray
    		if(map.containsKey(count)) {
    			maxlen = Math.max(maxlen, i - map.get(count));
    		} else 
    			map.put(count, i);
    	}
        
    	return maxlen;
    }
}
