class Solution {
    public int romanToInt(String s) {
        int value=0;
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            char a=s.charAt(i);
            if(a=='I')value=1;
            else if(a=='V')value=5;
            else if(a=='X')value=10;
            else if(a=='L')value=50;
            else if(a=='C')value=100;
            else if(a=='D')value=500;
            else value=1000;
            
            if(value*4<ans)ans-=value;
            else ans+=value;
        }
        return ans;
    }
}