class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min=0;
        int count1=word1.length();
        int count2=word2.length();
        StringBuilder sb=new StringBuilder();
        min=Math.min(count1,count2);
        for(int i=0;i<min;i++){
            char curr1=word1.charAt(i);
            char curr2=word2.charAt(i);
            sb.append(curr1);
            sb.append(curr2);
        }
        if(count1>min){
            while(min!=count1){
                sb.append(word1.charAt(min));
                min++;
            }
        }
        if(count2>min){
            while(min!=count2){
                sb.append(word2.charAt(min));
                min++;
            }
        }
        return sb.toString();
    }
}