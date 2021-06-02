class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            s+=((i+1)*(n-i)+1)/2*arr[i];
        }
        return s;
    }
}