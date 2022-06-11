class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet hset = new HashSet<Integer>();
        for (int num : nums) {
            if (hset.contains(num)) {
                return true;
            }
            hset.add(num);
        }
        return false;
    }
}