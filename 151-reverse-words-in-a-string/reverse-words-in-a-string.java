class Solution {
    public String reverseWords(String s) {
     StringBuilder sb=new StringBuilder("");
     int i=s.length()-1;
     int j=0;
     while(i>=0){
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        j=i;
        if(i<0){
            break;
        }
        while(i>=0 && s.charAt(i)!=' '){
            i--;
        }
        sb.append(s.substring(i+1,j+1));
        sb.append(" ");
     }
     return sb.toString().trim();
    }
}