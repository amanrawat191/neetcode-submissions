class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set  = new HashSet<>(); 
        for(int num : nums){
            set.add(num); 
        }
        int counter =1;
        int maxCount=1; 
     if(nums.length==0) return 0 ;
        for( int i = 0 ; i<nums.length ;i++){
            if(!set.contains(nums[i]-1)){
                int val=nums[i]; 
                counter=1; 
                while(set.contains(++val)){
                 counter++; 
                 maxCount=Math.max(counter,maxCount);
                }
            }
        }
        return maxCount; 
    }
}
