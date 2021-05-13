class Solution {
    public int maxDepth(String s) {
        int deapth=0,a=0;
        
        for(char val:s.toCharArray()){
            if(val=='(')
                a++;
            if(val==')')
                a--;
            deapth=Math.max(deapth,a);
        }
        return deapth;
    }
}