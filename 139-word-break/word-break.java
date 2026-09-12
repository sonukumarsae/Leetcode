class Solution {
    public boolean isExist(String s,HashSet<String> h,int index,Boolean dp[]){
        if(index<0){
            return true;
        }
       if(dp[index]!=null){
        return dp[index];
       }
       String str="";
      for(int i=index;i>=0;i--){
        str=s.charAt(i)+str;
        if(h.contains(str)){
        if(isExist(s,h,i-1,dp)){
           return dp[index]=true;
        }
        }
      }
        
          return dp[index]= false;
        
        
       
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp[]=new Boolean[s.length()];
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<wordDict.size();i++){
            h.add(wordDict.get(i));
        }
       
        
        return isExist(s,h,s.length()-1,dp);

    }
}