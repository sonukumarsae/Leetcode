class Solution {
    public int totalAmount(int nums[], int index ,int dp[]){
      if(index<0){
        return 0;
      }
      if(dp[index]!=-1){
        return dp[index];
      }
      int price1=nums[index]+totalAmount(nums,index-2,dp);
      int price2=totalAmount(nums,index-1,dp);
      return dp[index]=Math.max(price1,price2);
     
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
       
        return totalAmount(nums,nums.length-1,dp);
    }
}