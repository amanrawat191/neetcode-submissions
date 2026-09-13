class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(); 
       for(int i = 0; i<strs.size(); i++){
          sb.append(strs.get(i).length()+"#");
          sb.append(strs.get(i)); 
       }
       return sb.toString();
    }
    public List<String> decode(String str) {
        List <String> ls = new ArrayList<>(); 
        String count =""; 
        int num=0; 
        int i=0; 
        while(i<str.length()){
            count="";
            while(str.charAt(i)!='#'){
                count=count+str.charAt(i);
                i++; 
            }
        num = Integer.parseInt(count); 
        ls.add(str.substring(i+1,i+num+1)); 
        i=i+num+1; 
        }
         
               return ls ; 
          
    }
}
