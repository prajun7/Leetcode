/*
Algorithm:
1. Instead of getting startValue to target we will do opposite
2. We will use target value and get the start value
3. For that, we need to switch the operations that is,
    a. Divide by 2
    b. Add 1
    
Unique Case
1. If target value is less than start value, we can only decrement
eg: start value = 4
    target value = 1
    Only option to get target value from the start value is to subtract
    i.e. we will subtract 3 times to go to 1 from 4

*/

class Solution {
    public int brokenCalc(int startValue, int target){
        
        int numberOfOperations = 0;
        
        while(target != startValue)
        {
           // Unique Case
            if(startValue >= target) return ((startValue-target) + numberOfOperations);

            /* If target is even, the last move was multiplication, else decrement */
            if (target % 2 == 0) {
                target = target / 2 ;
            }
            else {
                target++;
            }

            // One operation used
            numberOfOperations ++;
        }

        return numberOfOperations;
    }
}

