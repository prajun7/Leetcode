/*
Algorithm:
1. nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
Find, nums1[i] + nums2[j] = -nums3[k] + nums4[l]
So, we will store nums1[i] + nums2[j] in hashMap and use that 
value to calculate the other sums.
*/

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        
        int count = 0;
        for (int i = 0; i < nums1.length; i++){
            for (int j = 0; j <nums2.length; j++){
                int sum = nums1[i] + nums2[j];
                hMap.put(sum, hMap.getOrDefault(sum,0)+1);
            }
        }
        
        for (int i = 0; i < nums3.length ; i++){
            for (int j = 0; j < nums4.length; j++){
                int sum = 0 - (nums3[i]+nums4[j]);   //Making it negative and comparing it in hashMap
              
                if (hMap.containsKey(sum)){
                   count = count + hMap.getOrDefault(sum,0);
                }
            }
        }
        
        return count;
        
    }
}
