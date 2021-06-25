class Solution {
    public int searchInsert(int[] nums, int target) {
        int length=nums.length;
        return binarySearch(nums,target,0,nums.length-1);
    }
    public int binarySearch(int nums[],int target,int l,int r){
        int mid=(l+r)/2;
        if(l<=r){
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>target)
                return binarySearch(nums,target,l,mid-1);
            if(nums[mid]<target)
                return binarySearch(nums,target,mid+1,r);
        }
        return l;
    }
}