class Solution {
    public boolean binarySearch(int[] arr,int l,int r,int x){
        if(r>=l){
            int mid=l+(r-l)/2;
            if(arr[mid]==x)
                return true;
            if(arr[mid]>x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
            return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans=false;
        for(int i=0;i<matrix.length;i++){
            if(target>=matrix[i][0] && target<=matrix[i][matrix[i].length-1]){
                ans=binarySearch(matrix[i],0,(matrix[i].length-1),target);
                if(ans==true)
                    return true;
            }
              
        }
        return ans;
    }
}