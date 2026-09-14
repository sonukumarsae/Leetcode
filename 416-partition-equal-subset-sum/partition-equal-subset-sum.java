class Solution {
    public boolean possible(int nums[],int index,int sum,int currSum,Boolean dp[][]){
        if(index<0){
            return false;
        }
        if(dp[index][currSum]!=null){
            return dp[index][currSum];
        }
        if(currSum+nums[index]==sum){
            return true;
        }

        if(currSum+nums[index]<sum){
           boolean a=possible(nums,index-1,sum,currSum+nums[index],dp);
           boolean b=possible(nums,index-1,sum,currSum,dp);
           return dp[index][currSum]= a || b;
           
           
        }
       return dp[index][currSum]=possible(nums,index-1,sum,currSum,dp);

    }
    public boolean canPartition(int[] nums) {
       
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        Arrays.sort(nums);
        sum=sum/2;
         Boolean dp[][]=new Boolean[nums.length][sum+1];
        return possible(nums,nums.length-1,sum,0,dp);
    }
}