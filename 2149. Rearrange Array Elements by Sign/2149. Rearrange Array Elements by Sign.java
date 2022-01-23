class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<Integer>(), neg = new ArrayList<Integer>();
        for (int a : nums)
            (a > 0 ? pos : neg).add(a);
        for (int i = 0; i < nums.length / 2; ++i) {
            nums[i * 2] = pos.get(i);
            nums[i * 2 + 1] = neg.get(i);
        }
        return nums;
    }
}