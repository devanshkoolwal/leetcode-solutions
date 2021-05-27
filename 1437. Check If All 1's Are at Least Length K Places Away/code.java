class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                last=i;
                break;
            }
        }
        
        
        for(int i=last+1;i<nums.length;i++){
            if(nums[i]==1){
                if(i-last>k)
                    last=i;
                else
                    return false;
            }
        }
        
        return true;
    }
}