class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length ; i++){
            int diff = target - nums[i];    //9-2 = 7    // 9-7 = 2
            if (hmap.containsKey(diff)){
                ans[0] = hmap.get(diff);
                ans[1] = i;
            }
            hmap.put(nums[i],i);    // <7,0>  <2,1>
        }  
        return ans;
    }
}

/*

<7,0>
<2,1>
<-3,2>




array: [1,2,3,4,5]
array[1] = 2

HashMap <Key, Value>
<"adad",45>
<0,2>
<5,9>
<4,9>



*/