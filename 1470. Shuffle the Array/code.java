class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int counter=0;
        int j=n;
        for(int i=0;i<n;i++){
            arr[counter++]=nums[i];
            arr[counter++]=nums[j++];
        }
        return arr;
    }
}