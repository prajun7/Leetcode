public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i ++){
            if ((n&1) == 1){  //AND operator will return 1 only if n consists of 1
                count = count + 1;
            }
            n = n >> 1;  //Shift n to right each time, so that we will get new bit each time for if statement.
        }
        return count;
        
    }
}