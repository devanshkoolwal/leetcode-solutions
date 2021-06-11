class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if (nums.length == 1)
		return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        if (max - min > 2 * k)
            return max - min - 2 * k;


        return 0;
    }
}