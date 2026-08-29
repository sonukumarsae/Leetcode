class Solution {
    public int helper(int coins[],int amount,int index,int dp[][]){
        if(index <0){
            return Integer.MAX_VALUE;
        }
        if(amount==0){
            return 0;
        }
      
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
       
        if(coins[index]<=amount){
        
         int a= helper(coins,amount-coins[index],index,dp);
         if(a!=Integer.MAX_VALUE){
                a=a+1;
         }
         int b=helper(coins,amount,index-1,dp);
         return dp[index][amount]= Math.min(a,b);
        }
        else{
            return dp[index][amount]= helper(coins,amount,index-1,dp);
        }
      

    }
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int dp[][]=new int[coins.length+1][amount+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        int ans=helper(coins,amount,coins.length-1,dp);
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
}