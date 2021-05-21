class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int ar[]=new int[1001];
        for(int i=0;i<nums1.length;i++){
            ar[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(ar[nums2[i]]!=0){
                arr.add(nums2[i]);
                ar[nums2[i]]--;
            }
                
        }
        
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        return a;
        
    }
}class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int ar[]=new int[1001];
        for(int i=0;i<nums1.length;i++){
            ar[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            if(ar[nums2[i]]!=0){
                arr.add(nums2[i]);
                ar[nums2[i]]--;
            }
                
        }
        
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i]=arr.get(i);
        }
        return a;
        
    }
}