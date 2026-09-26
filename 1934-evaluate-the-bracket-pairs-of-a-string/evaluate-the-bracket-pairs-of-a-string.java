class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> hm=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            String u=knowledge.get(i).get(0);
            String v=knowledge.get(i).get(1);
            hm.put(u,v);
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            String str="";
            char curr=s.charAt(i);
            if(curr=='('){
                i++;
                while(s.charAt(i)!=')'){
                    str+=s.charAt(i);
                    i++;
                }
                if(hm.containsKey(str)){
                    sb.append(hm.get(str));
                }
                else{
                    sb.append('?');
                }
                continue;
            }
            sb.append(curr);
        }
        return sb.toString();
    }
}