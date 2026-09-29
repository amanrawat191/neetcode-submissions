class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0, count2=0; 
        int candidate1=0, candidate2=0; 
        int counter1 = 0 ; 
        int counter2=0 ;
        List<Integer> li = new ArrayList<>();
        for(int i = 0 ; i<nums.length; i++){
             if(candidate1==nums[i]){
             count1++; 
            }
            else if( candidate2==nums[i]){  
                count2++; 
            }
            else if(count1==0){
                candidate1=nums[i]; 
                count1=1 ; 
            }
            else if(count2==0){
                candidate2=nums[i];
                count2=1;  
            }
            
          
            else {
                count1--; 
                count2--; 
            }
        }
        for(int i = 0 ; i<nums.length; i++){
            if(candidate1==nums[i]){
                counter1++; 
                if(counter1>nums.length/3){
                    li.add(candidate1); 
                    break ;
                } 
            }
        }

           for(int i = 0 ; i<nums.length; i++){
            if(candidate2==nums[i]){
                counter2++; 
                if(counter2>nums.length/3){
                    li.add(candidate2); 
                    break ;
                } 
            }
        }
        
        return li; 
    }
}