class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> hs1=new HashMap<>();
       HashMap<Character,Integer> hs2=new HashMap<>();

        for(int i=0;i<word1.length();i++){
            hs1.put(word1.charAt(i),hs1.getOrDefault(word1.charAt(i),0)+1);
            hs2.put(word2.charAt(i),hs2.getOrDefault(word2.charAt(i),0)+1);
           
        }
        if(!hs1.keySet().equals(hs2.keySet())){
            return false;
        }

        
       
        List<Integer> list1=new ArrayList<>(hs1.values());
        List<Integer> list2=new ArrayList<>(hs2.values());
      
       Collections.sort(list1);
       Collections.sort(list2);
       return list1.equals(list2);
    }
}