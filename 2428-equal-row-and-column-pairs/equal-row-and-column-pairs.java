class Solution {
    public int equalPairs(int[][] grid) {
         //3,2,1
         //1,7,6
         //2,7,7
         int count=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int arr[] : grid){
           String key=Arrays.toString(arr);
            map.put(key,map.getOrDefault(key,0)+1);
        }
      
        for(int i=0;i<grid.length;i++){
              int arr[]=new int[grid.length];
            for(int j=0;j<grid.length;j++){
                arr[j]=grid[j][i];
            }
            String key=Arrays.toString(arr);
           count+=map.getOrDefault(key,0);
        }
        return count;
    }
} 