class Solution {
    public int majorityElement(int[] nums) {
        int count = 1; 
        int freq=0; 
        int element = nums[0];
        for( int i = 1 ; i<nums.length ; i++){
            if(nums[i]==element) count++; 
            else count--; 
            if(count==0){
                element=nums[i]; 
                count=1; 
            }

        }
    //  for(int a : nums){
    //     if(a==element) freq++; 
    //  }
    //  if(freq>nums.length/2) return element ; 
    //  return -1; 
    return element; 
    }
}