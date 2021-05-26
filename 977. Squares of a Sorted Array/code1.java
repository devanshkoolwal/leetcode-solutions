class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int arr[]=new int[nums.length];
        int index=nums.length-1;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                arr[index--]=nums[l]*nums[l];
                l++;
            }
            else{
                arr[index--]=nums[r]*nums[r];
                r--;
            }
            
        }
        return arr;
    }
}