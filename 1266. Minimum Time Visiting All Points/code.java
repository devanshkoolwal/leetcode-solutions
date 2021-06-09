class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int distance =0;
        int i=0,j=1;
        while(j<points.length)
        {
            distance += Math.max(Math.abs(points[i][0]-points[j][0]),Math.abs(points[i][1]-points[j][1]));
            i=j;
            j++;
        }
        return distance;
    }
}