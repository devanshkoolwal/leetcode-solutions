class Solution {
    public int removeElement(int[] nums, int val) {
        int last=nums.length-1;
        int count=0;
        for(int i=0;i<nums.length && last>=0;i++){
            if(nums[last]==val){
                nums[last--]=-1;
                i--;
                count++;
                
            }
            else if(nums[i]==val){
                nums[i]=nums[last];
                nums[last--]=-1;
                count++;
            }
        }
        return nums.length-count;
    }
}