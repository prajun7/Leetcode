class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low < high){
            
            //5+8/2 = 6
            
            int mid = (low + high)/2;   //  6
            int midValue = arr[mid];   // 99
            
            System.out.println(mid);
            
            if ( midValue > arr[mid +1] && midValue > arr[mid - 1]   ){
                return mid;
            }
            
            if (midValue < arr[mid + 1] && midValue > arr[mid -1]) {
                low = mid + 1;   //5
            } 
            else {
                high = mid;  
            }
            
        }
        
        return 0;
        
    }
}


/*

0,2,3,5,7,19,3,6,7,0


*/