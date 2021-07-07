class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int len=matrix.length;
        int arr[]=new int[len*len];
        int c=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++)
                arr[c++]=matrix[i][j];
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}