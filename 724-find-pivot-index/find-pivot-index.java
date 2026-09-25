class Solution {
    public int pivotIndex(int[] nums) {
        int curr[]=new int[nums.length];
       
        curr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            curr[i]=curr[i-1]+nums[i];
        }
        
        int total=curr[curr.length-1];
        for(int i=0;i<curr.length;i++){
            
            int leftsum=i==0 ? 0 : curr[i-1];
            int rightsum=i==curr.length-1 ? 0:total-curr[i];
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
        
    }
}