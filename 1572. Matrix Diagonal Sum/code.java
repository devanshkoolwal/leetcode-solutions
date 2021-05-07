class Solution {
    public int diagonalSum(int[][] mat) {
        int j=mat.length-1;
        int sum=0;
        for(int i=0;i<mat.length;i++){
            if(i!=j){
                sum+=mat[i][i];
                sum+=mat[i][j];
            }
            j--;
        }
        if(mat.length%2!=0)
            sum+=mat[mat.length/2][mat.length/2];
        
        return sum;
    }
}