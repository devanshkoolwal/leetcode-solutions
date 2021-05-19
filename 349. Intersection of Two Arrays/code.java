class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int a[]=new int[1001];
        ArrayList<Integer> b=new ArrayList();
        for(int i=0;i<nums1.length;i++){
            if(a[nums1[i]]==0){
                a[nums1[i]]=1;
            }
        }
        
        for(int j=0;j<nums2.length;j++){
            if(a[nums2[j]]==1){
                b.add(nums2[j]);
                a[nums2[j]]=0;
            }
        }
        
        int arr[]=new int[b.size()];
        for(int i=0;i<b.size();i++)
            arr[i]=b.get(i);
        
        return arr;
        
    }
}