class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> sum=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(sum.containsKey(nums[i])){
                ans[0]=sum.get(nums[i]);
                ans[1]=i;
                return ans;
            }
            sum.put(target-nums[i],i);
           
        }
        return ans;
    }
}