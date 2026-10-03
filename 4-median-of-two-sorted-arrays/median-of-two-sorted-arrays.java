class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        if(n==0){
            if(m%2==0){
               int i=m/2;
               int j=m/2-1;
               return (nums2[i]+nums2[j])/2.0;
            }
            else{
                return nums2[m/2]/1.0;
            }
        }
          if(m==0){
            if(n%2==0){
               int i=n/2;
               int j=n/2-1;
               return (nums1[i]+nums1[j])/2.0;
            }
            else{
                return nums1[n/2]/1.0;
            }
        }
       
        int tl=m+n;
        
            int target1=0;
            int target2=0;
            
            int i=0;
            int j=0;
            
            while(i<n && j<m){
                
                if(nums1[i]<=nums2[j]){
                    i++;
                    if(i+j-1==(tl/2)-1){
                        target1=nums1[i-1];
                    }
                    if(i+j-1==tl/2){
                        target2=nums1[i-1];
                        break;
                    }
                }
                else{
                    j++;
                      if(i+j-1==(tl/2)-1){
                        target1=nums2[j-1];
                    }
                    if(i+j-1==tl/2){
                        target2=nums2[j-1];
                        break;
                    }
                }
            }

            if(i+j!=tl/2+1){
                if(i<n){
                    while(i<n){
                    i++;
                      if(i+j-1==(tl/2)-1){
                        target1=nums1[i-1];
                    }
                    if(i+j-1==tl/2){
                        target2=nums1[i-1];
                        break;
                    }
                }
                }
                else{
                    while(j<m){
                    j++;
                      if(i+j-1==(tl/2)-1){
                        target1=nums2[j-1];
                    }
                    if(i+j-1==tl/2){
                        target2=nums2[j-1];
                        break;
                    }
                }  
                }
            }

            
        if(tl%2==0){
            return (target1+target2)/2.0;
        }
        return target2/1.0;
    
    }
}