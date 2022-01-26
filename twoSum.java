class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
    int[] arr = new int[2];
    for (int i = 0; i < nums.length ; i ++){
        
        int diff = target - nums[i];   
       if (hmap.containsKey(diff)){
            arr[0] = i;
            arr[1] = hmap.get(diff);
            return arr;   //Must have return here. Return as soon as we find
        }
        hmap.put(nums[i],i);
    }
        return arr;   //If not found than it will return empty array
        
    }
}

//In HashMap we are storing arr[i],index
// arr[i] , index
