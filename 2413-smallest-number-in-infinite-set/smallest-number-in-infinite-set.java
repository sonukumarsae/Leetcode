class SmallestInfiniteSet {
 PriorityQueue<Integer> pq=new PriorityQueue<>();;
  int max;
    public SmallestInfiniteSet() {
      pq.add(1);
       
    }
    
    public int popSmallest() {
       int curr= pq.remove();
       while(!pq.isEmpty() && pq.peek()==curr){
        pq.remove();
       }
       max=Math.max(max,curr);
       pq.add(++max);
       return curr;
       
    }
    
    public void addBack(int num) {
        
            pq.add(num);
        
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */