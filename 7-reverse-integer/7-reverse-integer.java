class Solution {
    public int reverse(int x) {
        
        int reverse = 0;
        int curr;
      
        int upperBound = Integer.MAX_VALUE/10;
        int upperDigit = Integer.MAX_VALUE%10;
        
        int lowerBound = Integer.MIN_VALUE/10;
        int lowerDigit = Integer.MIN_VALUE%10;
        
        while (x != 0){
            
        curr = x % 10;
        x = x /10;
        
        
        if ((reverse > upperBound) || (reverse == upperBound && curr > upperDigit)){
            return 0;
        }
        
       else if ((reverse < lowerBound) || (reverse == lowerBound && curr < lowerDigit)){
            return 0;
        }
            else{
        
        reverse = reverse * 10 + curr;
            }
               
              }
        return reverse;
        
    }
}