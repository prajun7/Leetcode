class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length -1;
        return help(nums,low, high,target);
      
    }
    
    public int help (int[] nums, int low, int high, int target){
        
        if (high >= low ){   // This if statement is very important
                            // Must include this if statement
                           // If not included we can't use return -1 at the end.
        
            int mid = low + (high-low)/2;
        
            if (nums[mid] == target){
                return mid;
                }
        
            else if (nums[mid] < target){
                return help(nums,mid+1, high,target);
                }
            else{
                return help(nums,low,mid-1,target);
                }
            
        }  // the  if (high >= low ) statement end
        
         return -1;
        
    }
}