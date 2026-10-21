class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 ; 
        int back=nums1.length-1; 
        while(m>0 && n>0){
            if(nums1[m-1]>=nums2[n-1]){
              nums1[back]=nums1[m-1]; 
              m--; 
              back--; 
            }
            else {
                nums1[back]=nums2[n-1]; 
                n--; 
                back--; 
            }
           
            }
            while(m>0){
             nums1[back]=nums1[m-1]; 
             back--; 
             m--;
            }
             while(n>0){
             nums1[back]=nums2[n-1]; 
             back--; 
             n--;
            }
        }
    }
