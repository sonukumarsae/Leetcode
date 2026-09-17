class Solution {
    public int minSum(int grid[][],int i, int j,int dp[][]){
        if(i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
       
        int a =minSum(grid,i+1,j,dp);
        int b=minSum(grid,i,j+1,dp);
        return dp[i][j]=grid[i][j]+Math.min(a,b);

      
    }
    public int minPathSum(int[][] grid) {
         int dp[][]=new int[grid.length][grid[0].length];
         for(int d[]:dp){
            Arrays.fill(d,-1);
         }
         return minSum(grid,0,0,dp);
    }
} 