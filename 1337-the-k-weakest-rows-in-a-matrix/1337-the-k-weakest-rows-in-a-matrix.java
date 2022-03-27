/*
 O(nlogn +n) && O(n)
Approach:
-> First we will create a Priority Queue with a comparator class so that whenever a count of 1 is same in 2 rows then it will give priority to the lower index value.
-> Store the count of 1 with rows value in the queue.
-> Pop the values until we get the k values for the result.

*/

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]); //To store the row index and number of row in that index
        for(int i = 0; i < mat.length; i++) {
            int j = countOneByBinarySearch(mat, i); //To find the number of 1's in that row by binary search
            pq.add(new int[]{i, j}); //Inserting row index and counts of 1's in that row
        }
        
        int[] result = new int[k];
        for(int i=0;i<k;i++) {
            result[i] = pq.poll()[0]; //we will pop from the queue until we get k values.
        }
        
        return result;
    }
    
    private int countOneByBinarySearch(int[][] mat, int i) { // Binary Search
        int l = 0, r = mat[i].length - 1;
        while(l < r) {
            int m = l + (r - l) / 2;
            if(mat[i][m] == 1)
                l = m + 1;
            else
                r = m;
        }
        
        return mat[i][l] == 1 ? l + 1 : l;  //To check all the value of row should not be zero
    }
}