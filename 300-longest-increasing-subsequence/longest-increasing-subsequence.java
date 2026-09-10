class Solution {
   public int count(int nums[],int index,int dp[][],int currentindex){
    if(index==0){
        return 0;
    }
    if(dp[currentindex][index]!=-1){
        return dp[currentindex][index];
    }
    if(nums[currentindex]>nums[index-1]){
        int b=1+count(nums,index-1,dp,index-1);
        int c=count(nums,index-1,dp,currentindex);
        return dp[currentindex][index]= Math.max(b,c);
    }
    else{
        return dp[currentindex][index]=count(nums,index-1,dp,currentindex);
    }
   }
    public int lengthOfLIS(int[] nums) {
     int dp[][]=new int[nums.length][nums.length];
     for(int d[]:dp){
        Arrays.fill(d,-1);
     }
     int ans=0;
     for(int i=0;i<nums.length;i++){
    ans=Math.max(ans, 1+count(nums,i,dp,i));
     }
     return ans;
    }
}