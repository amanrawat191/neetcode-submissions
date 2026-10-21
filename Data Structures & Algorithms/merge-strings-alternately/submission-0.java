class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = 0; 
        String ans=""; 
        while(l<word1.length()&& l<word2.length()){
         ans=ans+word1.charAt(l)+word2.charAt(l); 
         l++; 
        }
        while(l<word1.length()){
            ans=ans+word1.charAt(l); 
            l++; 
        }
        while(l<word2.length()){
            ans=ans+word2.charAt(l); 
            l++; 
        }
        return ans; 
    }
}