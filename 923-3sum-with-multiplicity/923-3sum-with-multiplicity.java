class Solution {
    public int threeSumMulti(int[] A, int target) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int n = A.length;
        long result = 0;
        
        for(int i = 0; i + 1 < n; i++){
            for(int j = i + 1; j < n; j++){
                if(count.containsKey(target - A[i] - A[j])){
                    result += 1L * count.get(target - A[i] - A[j]); 
                    //System.out.println(result);
                }
            }
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);
        }
        
       // System.out.println(result);
        return (int) (result%(1000000000 + 7));
    }
}