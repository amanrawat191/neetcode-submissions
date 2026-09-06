class Solution {
    public boolean isAnagram(String s, String t) {
     Map<Character, Integer> H1 = new HashMap<>();
     Map<Character, Integer> H2 = new HashMap<>();
     int i =0; 
     for( char c : s.toCharArray()){
        if(H1.containsKey(c))
        H1.put(c,H1.get(c)+1);
        else 
        H1.put(c,1);
     }
     for( char c : t.toCharArray()){
        if(H2.containsKey(c))
        H2.put(c,H2.get(c) +1);
        else 
        H2.put(c,1);
     }
       return H1.equals(H2); 
    }
}
