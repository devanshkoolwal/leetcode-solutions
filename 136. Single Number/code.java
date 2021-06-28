class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(arr.indexOf(nums[i])==-1){
                arr.add(nums[i]);
            }else{
                arr.remove(new Integer(nums[i]));
            }
        }
        return arr.get(0);
    }
}