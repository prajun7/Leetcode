class Solution {
     public static int[] sortArrayByParity(int[] nums) {
            int start = 0, end = nums.length - 1;
            while (start < end) {
                if (nums[start] % 2 == 0) {
                    start++;
                } else {
                    int tmp = nums[end];
                    nums[end--] = nums[start];
                    nums[start] = tmp;
                }
            }
            return nums;
        }
}