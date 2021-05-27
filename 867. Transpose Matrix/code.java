class Solution {
    public int[][] transpose(int[][] matrix) {
        int arr[][]=new int[matrix[0].length][matrix.length];
        
        
        for(int i=0;i<matrix.length;i++){
            int count=0;
            for(int j=0;j<matrix[0].length;j++){
                arr[count++][i]=matrix[i][j];
            }
        }
        return arr;
    }
}