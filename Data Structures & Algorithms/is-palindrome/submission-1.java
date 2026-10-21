class Solution {
    public boolean isPalindrome(String s) {
      
        String temp = s.toLowerCase().replace(" ","").trim();
        int left = 0; 
        int right = temp.length()-1;  
        while(left<right){
while(left<right && !Character.isLetterOrDigit(temp.charAt(left))){
            left++; 
         }
         while(left<right&&!Character.isLetterOrDigit(temp.charAt(right))){
            right--; 
         }
          if(temp.charAt(left)!=temp.charAt(right)){
            return false; 
          }
          left++; 
          right--; 
        }
        return true; 
    }
}
