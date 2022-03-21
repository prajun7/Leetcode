/*
See Hints in leetcode,
1. In-place means we should not be allocating any space for extra array. But we are allowed to modify the existing array. However, as a first step, try coming up with a solution that makes use of additional space. For this problem as well, first apply the idea discussed using an additional array and the in-place solution will pop up eventually.

Algorithm,
1. Whenever you encounter non zero number just add that number to the beginning of the array
2. After that at the end of the array just add zeroes

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
        
        // j represents the number of non zero number also
        // Calculate number of times to loop
        int loop = nums.length - j;
        
        // Add zeroes from the end
        int lastIndex = nums.length - 1;
        for (int i = 0; i < loop  ; i++){
            nums[lastIndex] = 0;
            lastIndex--;
        }
        

    }
}