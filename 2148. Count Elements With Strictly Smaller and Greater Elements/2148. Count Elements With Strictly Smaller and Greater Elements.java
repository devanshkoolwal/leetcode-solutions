class Solution {
    public int countElements(int[] nums) {
        if(nums.length<3) return 0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int a:nums){
            if(map.containsKey(a)) map.put(a,map.get(a)+1);
            else map.put(a,1);
            if(min>a) min=a;
            if(max<a) max=a;
        }
        int ans=nums.length-map.get(min)-map.get(max);
        return ans<0?0:ans;
        
    }
}