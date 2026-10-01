class Solution {
    public int equalPairs(int[][] grid) {
         //3,2,1
         //1,7,6
         //2,7,7
         int count=0;
        if(grid.length==1){
            return 1;
        }
        int k=0;
        HashMap<Integer,int[]> map=new HashMap<>();
        for(int arr[] : grid){
            map.put(k,arr);
            k++;
        }
      
        for(int i=0;i<grid.length;i++){
              int arr[]=new int[grid.length];
            for(int j=0;j<grid.length;j++){
                arr[j]=grid[j][i];
            }
            for(int maparray[]:map.values()){
                if(Arrays.equals(arr,maparray)){
                    count++;
                }
            }
        }
        return count;
    }
} 