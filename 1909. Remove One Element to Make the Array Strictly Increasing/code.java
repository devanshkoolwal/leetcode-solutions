class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        int num = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]-nums[i+1]>=0){
                num +=1;
                if(i-1>=0 && i+2<=nums.length-1 && nums[i]-nums[i+2]>=0 && nums[i-1]-nums[i+1]>=0){
                    return false;
                }
            }
            
        }
        return num <= 1;
    
    }
}