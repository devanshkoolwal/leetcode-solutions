class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max=0;
        int count=0;
        
        for(int[] a:rectangles){
            int s=Math.min(a[0],a[1]);
            if(s>max){
                max=s;
                count=1;
                
            }
            else if(s==max){
                count++;
            }
        }
        return count;  
            
        
    }
}