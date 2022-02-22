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