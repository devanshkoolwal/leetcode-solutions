class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0;
        int n=height.length;
        int j=n-1;
        
        while(i<j){
            max=Math.max(max,(Math.min(height[i],height[j])*(j-i)));
            if(height[i]>height[j]){
                j--;
            }
            else
                i++;
        }
        return max;
    }
}