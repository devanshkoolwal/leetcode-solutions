class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int c=0;
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
            arr[c++]=nums[i];
        for(int i=0;i<nums.length;i++)
            arr[c++]=nums[i];
        return arr;
    }
}