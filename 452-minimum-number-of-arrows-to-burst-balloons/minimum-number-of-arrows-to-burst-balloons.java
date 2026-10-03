class Solution {
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public int compareTo(Pair P1){
            return Integer.compare(y,P1.y);
        }
    }
    public int findMinArrowShots(int[][] points) {
      PriorityQueue<Pair> pq=new PriorityQueue<>();
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