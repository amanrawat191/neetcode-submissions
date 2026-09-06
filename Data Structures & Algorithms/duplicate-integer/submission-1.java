class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mp = new HashSet<>(); 
        for(int i= 0  ;i<nums.length; i++){
            if(!mp.contains(nums[i])){
            mp.add(nums[i]); 
            }
            else {
                return true; 
            }
        }
        return false; 
    }
}