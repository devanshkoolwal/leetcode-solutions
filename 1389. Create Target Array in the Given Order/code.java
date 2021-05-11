class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ArrList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) 
            ArrList.add(index[i], nums[i]);
        
        for (int i = 0; i < nums.length; i++) 
            nums[i] = ArrList.get(i);
        
        return nums;
    }
}