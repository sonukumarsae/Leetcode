class Solution {
    public int maxVowels(String s, int k) {
        int max=Integer.MIN_VALUE;
        int count=0;
        Queue<Character> q=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                count++;
            }
            q.add(s.charAt(i));
        }
        max=Math.max(count,max);
      
       for(int i=k;i<s.length();i++){
            char remove=q.poll();
            char curr=s.charAt(i);
            q.add(curr);
            if(remove=='a' ||remove=='e' ||remove=='i' ||remove=='o' ||remove=='u'){
                count--;
            }
            if(curr=='a' ||curr=='e' ||curr=='i' ||curr=='o' ||curr=='u'){
                count++;
            }
            max=Math.max(count,max);
       } 
       return max;
    }
}