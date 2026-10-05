class Solution {
    public boolean checkValidString(String s) {
    //    Stack<Character> stack=new Stack<>();
    //    Stack<Character> stack1=new Stack<>();
    //    int count=0;
    //    int i=0;
    //    while(i<s.length()){
    //         if(s.charAt(i)=='*'){
    //             count++;
    //             i++;
                
    //         }
    //         else if(s.charAt(i)==')'){
    //         if(!stack.isEmpty() && stack.peek()=='('){
    //             stack.pop();
    //             i++;
    //         }
    //         else if(count>0 ){
    //             count--;
    //             i++;
    //         }
    //         else{
    //             return false;
    //         }
    //         }
    //         else{
    //        stack.push(s.charAt(i));
    //        i++; 

    //         }
            
    //    }
    //    int count1=0;
    //    int j=s.length()-1;
    //     while(j>=0){
    //         if(s.charAt(j)=='*'){
    //             count1++;
    //             j--;
                
    //         }
    //         else if(s.charAt(j)=='('){
    //         if(!stack1.isEmpty() && stack1.peek()==')'){
    //             stack1.pop();
    //             j--;
    //         }
    //         else if( count1>0 ){
    //             count1--;
    //             j--;
    //         }
    //         else{
    //             return false;
    //         }
    //         }
    //         else{
    //        stack1.push(s.charAt(j));
    //        j--; 

    //         }
            
    //    }

    //  return true;
    int min=0;
    int max=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            min++;
            max++;
        }
        if(s.charAt(i)==')'){
            min--;
            max--;
        }
        if(s.charAt(i)=='*'){
            min--;
            max++;
        }
        min=Math.max(min,0);
        if(max<0){
        return false;
        }
    }
    return min==0;
    }
}