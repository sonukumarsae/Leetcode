class Solution {
 
    public int maxProduct(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       int ans=nums[0];
       for(int i=1;i<nums.length;i++){
        int x=nums[i];
        int oldmax=max;
        int oldmin=min;

         max=Math.max(x,Math.max(x*oldmin,x*oldmax));
         min=Math.min(x,Math.min(x*oldmax,x*oldmin));
         ans=Math.max(ans,max);

       }
       return ans;
        
    }
}