class Solution {
    public int count(String text1,String text2,int n,int m,int dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(text1.charAt(n-1)==text2.charAt(m-1)){
            return dp[n][m]= 1+count(text1,text2,n-1,m-1,dp);
        }
        else{
            int a=count(text1,text2,n-1,m,dp);
            int b=count(text1,text2,n,m-1,dp);
            return dp[n][m]= Math.max(a,b);
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return count(text1,text2,text1.length(),text2.length(),dp);

    }
}