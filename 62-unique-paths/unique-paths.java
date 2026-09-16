class Solution {
    public int count(int m,int n,int i, int j,int dp[][]){
        if(i==m || j==n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        int a=count(m,n,i+1,j,dp);
        int b=count(m,n,i,j+1,dp);
        return dp[i][j]= a+b;

    }
    public int uniquePaths(int m, int n) {
      
        int dp[][]=new int[m][n];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return count(m,n,0,0,dp);
    }
}