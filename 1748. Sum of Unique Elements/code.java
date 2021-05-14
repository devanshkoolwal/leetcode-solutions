class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(!num.containsKey(nums[i])){
                sum+=nums[i];
                num.put(nums[i],1);
            }
            else if(num.get(nums[i])==1){
                sum-=nums[i];
                num.put(nums[i],2);
            }
        }
        
        return sum;
    }
}