class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int a=nums[i];
                nums[i]=nums[i]+(nums[i-1]-nums[i])+1;
                count=count+(nums[i]-a);
            }
        }
        return count;
    }
}