// We will use binary search

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