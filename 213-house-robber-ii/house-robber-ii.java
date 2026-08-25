class Solution {
    int i=0;
    public int total(int nums[],int index,int stop,int dp[]){
      if(index<=stop){
        return 0;
      }
        if(dp[index]!=-1){
            return dp[index];
        }
        
        int included=nums[index]+total(nums,index-2,stop,dp);
        int excluded=total(nums,index-1,stop,dp);
        return dp[index]=Math.max(included,excluded);
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp[]=new int[nums.length];
        int dp1[]=new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);
        int a=total(nums,nums.length-1,0,dp);
        int b=total(nums,nums.length-2,-1,dp1);
        return Math.max(a,b);
    }
}