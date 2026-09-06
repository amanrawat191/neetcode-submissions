class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length()) return false; 
    int arr[] = new int[26]; 
    for(char c : s.toCharArray()){
      int temp = arr[c-'a']; 
      arr[c-'a']=temp+1; 
    }
    for(char c : t.toCharArray()){
      int temp = arr[c-'a']; 
      arr[c-'a']=temp-1; 
    }
    for(int i  = 0 ;i<arr.length; i++){
      if(arr[i]!=0) return false; 
    }
    return true; 
    }
}
