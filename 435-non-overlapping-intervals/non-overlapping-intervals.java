class Solution {
    static class endtimesorting implements Comparable<endtimesorting>{
       
        int start;
        int end;
        public endtimesorting(int start,int end){
            this.start=start;
            this.end=end;
        }
        @Override

        public int compareTo(endtimesorting T2){
          return this.end-T2.end;
            
        }
        
       
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        PriorityQueue<endtimesorting> pq=new PriorityQueue<>();
        int i=0;
        for(int t[]: intervals){
            int st=t[0];
            int end=t[1];
            pq.add(new endtimesorting(st,end));
            
        }
        int count=1;
        endtimesorting curr=pq.poll();
        while(!pq.isEmpty()){
            endtimesorting curr1=pq.poll();
           if(curr1.start>=curr.end){
            count++;
            curr=curr1;
           } 

        }
    return intervals.length-count;
    }
}