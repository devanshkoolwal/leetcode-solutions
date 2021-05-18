class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans=new ArrayList<Integer>();
        
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int j=0;j<matrix[i].length;j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                    index=j;
                }
            }
            int max=Integer.MIN_VALUE;
            int index1=0;
            for(int k=0;k<matrix.length;k++){
                if(max<matrix[k][index]){
                    max=matrix[k][index];
                    index1=k;
                }
            }
            
            if(i==index1){
                ans.add(matrix[i][index]);
            }
            
        }
        return ans;
    }
}