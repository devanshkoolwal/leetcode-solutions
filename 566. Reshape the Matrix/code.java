class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int h=mat.length;
        int w=mat[0].length;
        int arr[][]=new int[r][c];
        if(h*w!=r*c)
            return mat;
        else{
            int rc=0;
            int cc=0;
            
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    arr[rc][cc]=mat[i][j];
                    cc++;
                    if(cc==c){
                        cc=0;
                        rc++;
                    }
                        
                }
            }
        }
        return arr;
    }
}