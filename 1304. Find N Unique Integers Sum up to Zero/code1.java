class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int start=0;
        int last=n-1;
         for(int i=(n/2)*-1;i<((n%2==0)?0:1);i++){
            arr[last--]=-i;
            arr[start++]=i;
        }   
        return arr;
    }
}