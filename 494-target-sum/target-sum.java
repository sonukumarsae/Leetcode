class Solution {
    public int Count(int nums[],int target,int currSum,int i){
        if(i<0 && target==currSum){
            return 1;
        }
        if(i<0){
            return 0;
        }
        
           int a= Count(nums,target,currSum+nums[i],i-1);
            int b=Count(nums,target,currSum-nums[i],i-1);
            return a+b;
        
      
    }
    public int findTargetSumWays(int[] nums, int target) {
       
        return Count(nums,target,0,nums.length-1);
    }
}