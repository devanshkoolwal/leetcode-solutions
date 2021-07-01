class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1||nums.length==0)
        {
            return;
        }
        int i=0,j=1;
        while(j<nums.length)
        {
            if(nums[i]==0)
            {
               int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
            else{
                i++;
            
            }
            if(j<=i)
                j=i+1;
        }
        
    }
}