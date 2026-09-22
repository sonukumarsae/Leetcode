class Solution {
    public int compress(char[] chars) {
        int j=0;
        for(int i=0;i<chars.length;i++){
            char curr=chars[i];
            int count=1;
            
           while(i<chars.length-1 && curr==chars[i+1]){
                count++;
                i++;
           }
           if(count>1){
            chars[j++]=curr;
            
            String countstr=String.valueOf(count);
            char digits[]=countstr.toCharArray();
            for(char c:digits){
                chars[j++]=c;
            }
           }
           else{
            chars[j++]=curr;
            
           }
            
        }
        return j;
    }
}