public class Solution {
    public String reverseWords(String s) {

        //Convert to char array
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != ' ') {   
        // when i is a non-space
        // Must be ' ' not " ", beacuse " " will represent a string 
        // and we can't compare string with char
                
                int j = i;
                while (j + 1 < ca.length && ca[j + 1] != ' ') {
                    j++; } 

                // move j to the end of the word
                // i points the beginning of the word whereas j points the end of the word
                reverse(ca, i, j);
                //Calling the method reverse

                //Important to assign i to j
                //We are assigning i to the end of the word, 
                //so that we won't iterate over the same words
                 i = j;
            }
        }
        return new String(ca);
    }

    //Swap the beginning and ending of the letters
    private void reverse(char[] ca, int i, int j) {
        for ( ; i < j; i++, j--) {
      // This for loop is similiar to 
      // for (i = i, j = j ; i < j ; i++ , j --)
            char tmp = ca[i];
            ca[i] = ca[j];
            ca[j] = tmp;
        }
    }
}