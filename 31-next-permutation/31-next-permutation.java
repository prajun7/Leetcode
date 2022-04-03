public class Solution {
    public void nextPermutation(int[] nums) {
        int lastAscdIndex = -1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i+1]) {
                lastAscdIndex = i;
            }
        }

        // Already in reverse order. Return reverse.
        if(lastAscdIndex == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }

        //Find the minum number that is greater than nums[index+1]
        int minIndex = lastAscdIndex + 1;
        for(int i = lastAscdIndex+1; i < nums.length; i++){
            if(nums[i] > nums[lastAscdIndex] && nums[lastAscdIndex] < nums[minIndex])
                minIndex = i;
        }

        // Swap
        // int temp = nums[lastAscdIndex];
        // nums[lastAscdIndex] = nums[minIndex];
        // nums[minIndex] = temp;
        
        swap(nums,lastAscdIndex,minIndex);

        // Reverse the rest numbers
        reverse(nums, lastAscdIndex+1, nums.length-1);
        return;

    }
    
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;

    }

    public void reverse(int[] nums, int start, int end){
        while (start < end){
            swap(nums,start++,end--);
        }
        }
    }