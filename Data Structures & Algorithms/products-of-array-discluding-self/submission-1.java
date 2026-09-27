class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix = new int[nums.length]; 
       int suffix=1; 
        prefix[0]=1; 
        for(int i = 1 ; i<nums.length; i++){
         prefix[i]=prefix[i-1]*nums[i-1]; 
        }
        for(int i=nums.length-2; i>=0; i--){
            suffix=suffix*nums[i+1]; 
          prefix[i]=prefix[i]*suffix;
        }

       
        return prefix; 

    }
}  
