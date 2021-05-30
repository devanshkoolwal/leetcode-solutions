class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        int count=nums.length-1;
        for(int i=0;i<nums.length/2;i++){
            int a=nums[i]+nums[count--];
            num=(a>num)?a:num;
        }
        return num;
        
    }
}