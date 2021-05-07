class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int count=0;
            for(int j=0;j<points.length;j++){
                double distance=Math.sqrt(Math.pow((points[j][0]-queries[i][0]),2)+Math.pow((points[j][1]-queries[i][1]),2));
                if(distance<=queries[i][2]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}