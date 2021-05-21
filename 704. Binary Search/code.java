class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid=(l+r)/2;
        
        while(nums[mid]!=target && l<r){
            if(target>nums[mid]){
                l=mid+1;
            }
            else if(target<nums[mid]){
                r=mid-1;
            }
            mid=(l+r)/2;
        }
        
        if(nums[mid]==target)
            return mid;
        return -1;
    }
}