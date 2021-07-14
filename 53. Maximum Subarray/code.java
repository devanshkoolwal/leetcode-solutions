class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(sum,max);
            sum=sum<0?0:sum;
        }
        return max;
    }
}