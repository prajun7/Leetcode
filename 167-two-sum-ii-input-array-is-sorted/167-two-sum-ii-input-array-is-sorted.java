// We will use modified binary search
/*
Algorithm:
1. Add the end and start element and name it sum
2. If sum is less than target, move the start pointer to get bigger value
3. If sum is more than target, move the end pointer to get smaller value
4. If sum == target, break
5. Add 1 to both start and end, see question
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        
        int start = 0;
        int end = numbers.length - 1;
        
        while (true){
            int sum = numbers[start] + numbers[end];
            
            if (sum == target){
                break;
            }
            
            if (sum > target){
                end--;
            }else{
                start++;
            }
        }
        
        result[0] = start + 1;
        result[1] = end + 1;
        return result;
    }
}