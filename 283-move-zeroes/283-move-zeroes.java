class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        //j = 3
        
        int loop = nums.length - j;
        
        int lastIndex = nums.length - 1;
        
        for (int i = 0; i < loop  ; i++){
            nums[lastIndex] = 0;
            lastIndex--;
        }
        

    }
}