class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            
             leftsum=i==0 ? 0 : leftsum+nums[i-1];
            int rightsum=i==nums.length-1 ? 0:total-(leftsum+nums[i]);
            if(leftsum==rightsum){
                return i;
                
            }
        }
        return -1;
        
    }
}