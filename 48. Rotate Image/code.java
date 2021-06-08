class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }       
        }
         
        for(int i=0;i<matrix.length;i++){
            int beg=0,end=matrix.length-1;
            
            while(end>=beg){
                int temp=matrix[i][beg];
                matrix[i][beg]=matrix[i][end];
                matrix[i][end]=temp;
                ++beg;
                --end;
            }
            
        }
        return;
    }
}