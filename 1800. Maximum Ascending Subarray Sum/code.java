class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int max=0,sum=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i])
                sum+=nums[i];
            else{
                if(sum>max){
                    max=sum;
                    sum=0;
                }
                sum=nums[i];
            }
        }
        
        if(sum>max)
            max=sum;
        return max;
    }
}