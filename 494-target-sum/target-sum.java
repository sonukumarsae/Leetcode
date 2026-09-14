class Solution {
    public int Count(int nums[],int target,int currSum,int i,int dp[][],int totalsum){
        if(i<0 && target==currSum){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(dp[i][currSum+totalsum]!=-1){
            return dp[i][currSum+totalsum];
        }
           int a= Count(nums,target,currSum+nums[i],i-1,dp,totalsum);
            int b=Count(nums,target,currSum-nums[i],i-1,dp,totalsum);
            return dp[i][currSum+totalsum]= a+b;
        
      
    }
    public int findTargetSumWays(int[] nums, int target) {
        int totalsum=0;
        for(int a:nums){
            totalsum+=a;
        }
       int dp[][]=new int[nums.length][2*totalsum+1];
       for(int d[] : dp){
        Arrays.fill(d,-1);
       }
        return Count(nums,target,0,nums.length-1,dp,totalsum);
    }
}