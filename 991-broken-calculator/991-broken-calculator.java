/*
Algorithm:
1. Instead of getting startValue to target we will do opposite
2. We will use traget value and get the start value
3. For that, we need to switch the operations that is,
    a. Divide by 2
    b. Add 1

*/

class Solution {
    public int brokenCalc(int startValue, int target) {
        int numberOfOperations = 0;
        
        while( target > startValue ){
            numberOfOperations++;
            if ( target % 2 == 0 ) {
                target /= 2;
            }
            else{
                target++;
            }
        }
        
        return numberOfOperations + (startValue - target);
        
    }
}


