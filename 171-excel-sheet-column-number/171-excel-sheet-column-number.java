/*
For every additional digit of the string, we multiply the value of the digit by 26^n where n is the number of digits it is away from the one's place. This is similar to how the number 254 could be broken down as this: (2 x 10 x 10) + (5 x 10) + (4). The reason we use 26 instead of 10 is because 26 is our base.

For s = "BCM" the final solution would be (2 x 26 x 26) + (3 x 26) + (13)

We could do this process iteratively. Start at looking at the first digit "B". Add the int equivalent of "B" to the running sum and continue. Every time we look at the following digit multiply our running sum by 26 before adding the next digit to signify we are changing places. Example below:

"B" = 2
"BC" = (2)26 + 3
"BCM" = (2(26) + 3)26 + 13

if you expand this expression you will see it is identical to the example above :).

Also, Read this,
why sum + (letter - 'A' + 1)
ans:
    One way to think about it, you know char will give you an ASCII value of 'A'. What would ASCII 'A' - 'A' be? 0. Therefore if each uppercase letter increment also increments the value, 'B' -'A' gives you '1' with 'C' - 'A' giving you 2 and so on.

We have to add +1 since the problem starts it's values at 1 and not 0 which is what 'A' - 'A' would give us. Also note, this only works since we are only working with uppercase letters. If we had to compensate for lowercase, this technique would have to change.


*/

class Solution {
    public int titleToNumber(String columnTitle) {
        if (columnTitle == null){
            return -1;
        }
        
        int sum = 0;
        for (char letter : columnTitle.toCharArray()){
            sum = sum * 26;
            sum = sum + letter - 'A' + 1;
        }
        return sum;
        
    }
}