class Solution {
    public int maxArea(int[] height) {
        int frontPointer = 0;
        int endPointer = height.length - 1;
        int area = 0;
        
        while (frontPointer < endPointer){
            int minHeight = Math.min(height[frontPointer], height[endPointer]);
            area = Math.max(area, (endPointer - frontPointer) * minHeight);
            
            if (height[frontPointer] > height[endPointer]){
                endPointer--;
            }else{
                frontPointer++;
            }
        }
        
        return area;
        
    }
}