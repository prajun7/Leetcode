class Solution {
    public int majorityElement(int[] nums) {
        
        int major = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length ; i++){
            
        if( count == 0){           // This count must be at top not at the end.
                                    // Always first check if count == 0 or not.
            major = nums[i];
            }
            
            if (major == nums[i] ){
                count += 1;
            }
            else if (major != nums[i]){
                count -= 1;
            }
            
         
            
        }
        
        return major;
    }
}