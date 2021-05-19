class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        
        while(true){
            int count=0;
            for(int i=1;i<mat.length;i++){
                for(int j=1;j<mat[0].length;j++){
                    if(mat[i-1][j-1]>mat[i][j]){
                        int temp=mat[i-1][j-1];
                        mat[i-1][j-1]=mat[i][j];
                        mat[i][j]=temp;
                        count++;
                    }
                }
            }
            if(count==0){
                break;
            }
                
        }
        return mat;
    }
}