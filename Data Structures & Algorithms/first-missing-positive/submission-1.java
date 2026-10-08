class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>(); 
        
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]>0){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1); 
            }
        }
        
        for(int i = 1 ; i<=nums.length+1 ; i++){
         if(!mp.containsKey(i)){
            
            return i; 
         }
        }
        return -1; 
    }
}