class Solution {
    public int majorityElement(int[] nums) {
        int count=0,element=0;
        for(int i:nums){
            if(count==0) element=i;
            if(element==i) count++;
            else count--;
        }
        return element;
    }
     
}