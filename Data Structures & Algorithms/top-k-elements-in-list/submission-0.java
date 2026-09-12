class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>(); 
        int result[]= new int[k];
        List<Integer> list[] = new ArrayList[nums.length+1]; 
        for(int i = 0 ; i< nums.length; i++){
         mp.put(nums[i],mp.getOrDefault(nums[i],0)+1); 
        }
        for(int i = 0 ; i< list.length; i++){
            list[i]= new ArrayList<>(); 
        }
        for(var var : mp.entrySet()){
            list[var.getValue()].add(var.getKey()); 
        }
        int count =0; 
        for(int i = list.length-1; i>0; i--){
             
             for(int a : list[i]){
                result[count]=a; 
                count++; 
                if(count==k)
                return result; 
             }
        }
       return new int[0];
    }
}
