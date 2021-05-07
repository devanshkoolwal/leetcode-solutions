class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=arr[n-1];
        
        for(int i=n-2;i>=0;i--){
            int temp=max;
            if(max<arr[i]){
                max=arr[i];
            }
            arr[i]=temp;
            }
        arr[n-1]=-1;
        return arr;
    }
}