class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer, Integer> mp = new HashMap <>(); 
        mp.put(0,1); 
        int count=0; 
        int prefix =0; 
        for(int i = 0 ; i<nums.length ;i++){
            prefix= prefix+nums[i]; 
           
            if(mp.containsKey(prefix-k)){
            count=count+mp.get(prefix-k);
          
            }
             mp.put(prefix,mp.getOrDefault(prefix,0)+1); 
        
        }
        return count; 
    }
}