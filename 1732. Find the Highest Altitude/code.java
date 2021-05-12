class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int calculate=0;
        for(int i=0;i<gain.length;i++){
            calculate+=gain[i];
            if(calculate>max)
                max=calculate;
            }
        return max;
    }
}