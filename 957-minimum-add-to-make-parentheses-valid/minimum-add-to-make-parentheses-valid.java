class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
       int i=0;
        while(i<s.length()){
            if(!stack.isEmpty() && s.charAt(i)==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
            else{
            stack.push(s.charAt(i));
            }
            i++;

        }
        return stack.size();
    }
}