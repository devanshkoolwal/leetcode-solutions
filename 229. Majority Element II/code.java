class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int nums1=-1,nums2=-1,count1=0,count2=0,n=nums.length;
        for(int i:nums){
            if(i==nums1)count1++;
            else if(i==nums2)count2++;
            else if(count1==0){
                nums1=i;
                count1=1;
            }
            else if(count2==0){
                nums2=i;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        for(int i:nums){
            if(i==nums1)count1++;
            else if(i==nums2) count2++;
        }
        List<Integer> ans=new ArrayList<Integer>();
        if(count1>n/3) ans.add(nums1);        
        if(count2>n/3) ans.add(nums2);
        return ans;

    }
}