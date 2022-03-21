/*
See Hints in leetcode,
1. In-place means we should not be allocating any space for extra array. But we are allowed to modify the existing array. However, as a first step, try coming up with a solution that makes use of additional space. For this problem as well, first apply the idea discussed using an additional array and the in-place solution will pop up eventually.

*/

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        
        // Calculate number of times to loop
        int loop = nums.length - j;
        
        int lastIndex = nums.length - 1;
        
        for (int i = 0; i < loop  ; i++){
            nums[lastIndex] = 0;
            lastIndex--;
        }
        

    }
}