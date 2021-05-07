class Solution {
    public int arraySign(int[] nums) {
        float ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans*nums[i];
        }
        if(ans>0)
            return 1;
        else if(ans<0)
            return -1;
       
        return 0;
    }
}