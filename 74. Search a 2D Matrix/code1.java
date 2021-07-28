class Solution {
    int row=0;
    public boolean binarySearch(int[][] arr,int l,int r,int x){
        if(r>=l){
            int mid=l+(r-l)/2;
            if(arr[mid/row][mid%row]==x)
                return true;
            if(arr[mid/row][mid%row]>x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
            return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        row=matrix[0].length;
       return binarySearch(matrix,0,matrix.length*matrix[0].length-1,target);
    }
}