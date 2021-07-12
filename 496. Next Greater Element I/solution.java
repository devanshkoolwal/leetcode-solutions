class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums2.length;i++){
            int j;
            for(j=i+1;j<nums2.length;j++){
                if(nums2[i]<nums2[j])
                    break;
            }
            
            if(j==nums2.length)
                map.put(nums2[i],-1);
            else
                map.put(nums2[i],nums2[j]);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
            }
        
        return ans;
    }
}