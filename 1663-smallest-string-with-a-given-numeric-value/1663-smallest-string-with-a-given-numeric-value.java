/*
Algorithm:
1. First fill the array with only 'a'
2. Then, loop from the end and start adding the required character
3. We need to return lexicographically smallest word, so we loop
from the end
*/

/*
a = 1
b = 2
c = 3
d = 4...
z = 26
*/

class Solution {
    // TC: O(n)
    // SC: O(n)
    public String getSmallestString(int n, int k) {
        char[] ans = new char[n];
        
        // Add 'a'
        for(int i = 0 ; i < n ; i++){
            ans[i] = 'a';
            k--;   // reduce 'k' by 1, as we are adding char 'a'
        }
        
        int index = ans.length-1;
        while(k >= 26){             // if the value of k is greater than 26, add z
            ans[index] = 'z';
            k = k+1-26;
            index--;
        }

        // When we are here, it means that the value of k is less than 26
        // So, at that index just add that char
        ans[index] = (char)(k +'a');
        
        return new String(ans);

    }
}