class Solution {
    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int findMinArrowShots(int[][] points) {
      PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.y,b.y));
      for(int point[]:points){
        pq.add(new Pair(point[0],point[1]));
      } 
      int count=0;
      while(!pq.isEmpty()){
        Pair curr=pq.poll();
        count++;
        int shotpoint=curr.y;
        
        while(!pq.isEmpty() && shotpoint>=pq.peek().x){
            pq.poll();
        }
        
        
      }
      return count;
    }
}