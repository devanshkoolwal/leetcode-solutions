class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> num=new HashMap();
        
        for(int i=0;i<nums.length;i++){
            if(num.containsKey(nums[i]))
                return nums[i];
            else
                num.put(nums[i],1);
        }
        return 0;
    }
}