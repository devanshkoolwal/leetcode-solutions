class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        
        int max=0;
        int i=0;
        int a=nums1.length;
        int b=nums2.length;
            for(int j=i;j<b && i<a;j++){
                if(nums1[i]>nums2[j]){
                    i++;
                    j=i;
                }
                    
                else if(nums1[i]<=nums2[j])
                    if(j-i>max)
                        max=j-i;
                else if(j==b){
                    i++;
                    j=i;
                    }
            }
        
        return max;
    }
}