class Solution {
    public int longestSubarray(int[] nums) {
     int left=0;
     int right=0;
     int count=0;
     int max=0;
     int k=1;
     while(right<nums.length){
        if(nums[right]==0){
            k--;
        }
        while(k<0){
            if(nums[left]==0){
                k++;
            }
            left++;
        }
        max=Math.max(max,right-left);
        right++;
     }
     return max;
    }
}