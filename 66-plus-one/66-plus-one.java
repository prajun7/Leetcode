class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            
            // This case is for all the number less than 9,
            // Anytime we see a number less than 9, while iterating from the back
            // We can just increment that number and return it
            // This will work for 899 or 12321 or 21399 or any number other than all 9
            
            if(digits[i] < 9) {             
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // This case is for when the number is 99999 only or 99 or 9999999
        // We just create a array of that size and add 1 at the beginning
        // Rest, numbers in array will be 0, automatically
         int[] newNumber = new int [n+1];
         newNumber[0] = 1;
         return newNumber;
        
    }
}