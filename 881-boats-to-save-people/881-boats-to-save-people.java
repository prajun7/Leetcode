class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
    
        Arrays.sort(people);
        // After sorting we will have light weigth person on the left
        // and heavy weigth person on the right
        
        int left = 0;  
        int right = people.length - 1;
        
        while(left <= right){
            int sum = people[left] + people[right];
            
            // If sum is less than or equal to limit 
            // we can take both the left(light person) and right(heavy person) 
            if(sum <= limit){
                boatCount++;
                left++;
                right--;
            }
            else{
                // This means that sum is greater than limit,
                // so, we will take the heavy person from the right
                boatCount++;
                right--;
            }
        }
        
        return boatCount;
    }
}

