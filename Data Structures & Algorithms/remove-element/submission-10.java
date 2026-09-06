class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0 ; 
        int r= nums.length-1;
         
        if(nums.length==0) return 0 ;
        if(nums.length==1) {
            if(nums[l]==val) return 0; 
            else return 1; 
        }
        while(l<=r){
            if(nums[l]==val && nums[r]!=val){
                 nums[l]=nums[r];
                 l++; 
                 r--; 
            }
            else if(nums[l]!=val){
        l++; 
            }
         else{
           r--; 
            }
         
        }
        if(l==0) return l; 
       return l; 
        }
        
    
}