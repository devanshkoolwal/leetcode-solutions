class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++)
                num.add(nums[i+1]);
        }
        int out[]=new int[num.size()];
        for(int i=0; i < out.length; i++)
        {
            out[i] = num.get(i).intValue();
        }
        return out;
    }
}