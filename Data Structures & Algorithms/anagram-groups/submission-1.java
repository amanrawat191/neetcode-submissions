class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
      
        for (int i = 0; i < strs.length; i++) {
            int ch[] = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                char word = strs[i].charAt(j);
                ch[word - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int itr = 0; itr < 26; itr++) {
                sb=sb.append("#");
                sb = sb.append(ch[itr]);
            }
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        // traverse the map
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
             result.add(entry.getValue()); 
        }
        return result;
    }
}
