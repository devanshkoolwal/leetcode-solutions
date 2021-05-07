class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=99999999;
        int index=-1;
       for(int i=0;i< points.length;i++){
            if(points[i][0]==x || points[i][1]==y ){
                
                int sum=java.lang.Math.abs(x-points[i][0])+java.lang.Math.abs(y-points[i][1]);
                if(min>sum){
                    min=sum;
                    index=i;
                }}}
      
        return index;
    }
}