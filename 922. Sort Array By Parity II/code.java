class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr[]=new int[nums.length];
        int oi=1,ei=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[ei]=nums[i];
                ei+=2;
            }
            else{
                arr[oi]=nums[i];
                oi+=2;
            }
        }
        
        
        return arr;
    }
}