class Solution {
    public void mergeSort(int [] nums, int l, int r){
     if  ( l<r ){
        int mid= (l+r)/2; 
        mergeSort(nums,l,mid); 
        mergeSort(nums,mid+1,r); 
        merge(nums,l,r,mid); 
     }
    }
    public void merge(int[] nums,int l, int r, int mid){
        int arr[]=new int[r-l+1];
        int left=l; 
        int right=mid+1; 
        int i = 0 ; 
        while(left<=mid && right <=r){
            if(nums[left]<=nums[right]){
            arr[i]=nums[left];  
            left++;  
            }
            else 
            {
            arr[i]=nums[right]; 
            right++; 
            }
            i++; 
        }
        while(left<=mid){
            arr[i]=nums[left]; 
            i++; 
            left++; 
        }
        while(right<=r){
            arr[i]=nums[right]; 
            i++; 
            right++; 
        }
        for( int k = 0 ;k < arr.length; k++){
            nums[l+k]=arr[k];
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums; 
    }

}