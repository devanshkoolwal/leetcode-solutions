class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        
        int m=mat.length;
        int n=mat[0].length;
        int i=0,j=0;
        int count=0;
        int ans[][]=new int[m][n];
        for(int l=0;l<(m*n);l++){
            count++;
            int sum=0;
            for(int r=Math.max(0,(i-k));r<=Math.min((i+k),(m-1));r++){
                for(int c=Math.max(0,(j-k));c<=Math.min((j+k),(n-1));c++){
                    sum+=mat[r][c];
                }
                
            }
            ans[i][j]=sum;
            
            j++;
            if(count==n){
                i++;
                count=0;
                j=0;
            }
        }
        return ans;
    }
}