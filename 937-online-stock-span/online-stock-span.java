class StockSpanner {
    int i=0;
    
    static class Info{
        int price;
        int index;
        public Info(int price,int index){
        this.price=price;
        this.index=index;
    }
    }
    public StockSpanner() {
        

    }
    Stack<Info> s=new Stack<>();
    public int next(int price) {
        i++;
        if(s.isEmpty()){
            s.push(new Info(price,i));
        }
        else{
       while(!s.isEmpty()){
           
            while(!s.isEmpty() && s.peek().price<=price){
                s.pop();
            }
            
                s.push(new Info(price,i));
                break;

       }
        }
       if(s.size()==1){
        return s.peek().index;
       }
       else{
        Info curr1=s.pop();
        int val=curr1.index-s.peek().index;
        s.push(curr1);
        return val;
       }
        
}

}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

