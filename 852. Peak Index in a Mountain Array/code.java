class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max=0;
        int index=0;
        
        for(int i=1;i<=arr.length-2;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                max=Math.max(max,arr[i]);
                index=(max==arr[i])?i:index;
            }
        }
        return index;
    }
}