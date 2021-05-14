class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char a:moves.toCharArray()){
            if(a=='D')
                x--;
            else if(a=='U')
                x++;
            else if(a=='R')
                y++;
            else
                y--;
        }
        if(x==0 && y==0)
            return true;
        
        return false;
    }
}