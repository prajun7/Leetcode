class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            hSet.add(nums[i]);
        }
        
        int seq = 0;
        for (int i = 0; i < nums.length; i++){
            if (hSet.contains(nums[i]-1) == false ){
                int hseq = 0;
                 int j = 0;
                while(hSet.contains(nums[i] + j)){
                    hseq++;
                    j++;
                }
                
                seq = Math.max(seq,hseq);
        }
        
    }
        
        return seq;
}
                      
 }