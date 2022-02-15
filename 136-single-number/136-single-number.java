class Solution {
    // Using XOR
    // a XOR a is equal to 0, that is when we XOR same number we get 0
    // 4 xor 1 xor 2 xor 1 xor 2 , here 1 and 2 will cancel out and we will be left with 4, which is our answer
    
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length ; i++){
            res = res ^ nums[i];
        }
        
        return res;
        
    }
}