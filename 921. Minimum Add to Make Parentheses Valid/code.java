class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        
        int count=0;
        for(char a:s.toCharArray()){
            if(a=='(')
                open++;
            else if(a==')' && open==0)
                count++;
            else if(a==')')
                open--;
        }
        return open+count;
    }
}