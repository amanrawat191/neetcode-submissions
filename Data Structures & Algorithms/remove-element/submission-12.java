class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;
       if(nums.length==0) return l ; 
        while (l <= r) {
            if (nums[l] == val && nums[r] != val) {
                nums[l] = nums[r];
                l++;
                r--;
            } 
            else if (nums[l] != val) {
                l++;
            } 
            else {
                r--;
            }
        }

        return l;
    }
}