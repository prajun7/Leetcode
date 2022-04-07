// Watch this
// Priority queue solution in java
// Priority queue in java is min Heap but we need max heap
// We can change the sign of the value to make it max Heap
// Check: https://www.youtube.com/watch?v=fBPS7PtPtaE

class Solution {
    public int lastStoneWeight(int[] stones) {
        int stoneWeight = 0, stoneArrayLength = stones.length;

        while (stoneArrayLength > 1) {
            Arrays.sort(stones, 0, stoneArrayLength); 

            int lastElemIndex = stoneArrayLength - 1;
            stones[lastElemIndex - 1] = stones[lastElemIndex] - stones[lastElemIndex - 1];
            stoneArrayLength--; // Reduce the array range to sort for every iteration
        }

        if (stones.length >= 1) {
            stoneWeight = stones[0];
        }

        return stoneWeight;
    }
}