class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss=new Stack();
        Stack<Character> tt=new Stack();
        for(char a:s.toCharArray()){
            if(a=='#' && !ss.empty())
                ss.pop();
            else if(a!='#')
                ss.push(a);
        }
        for(char a:t.toCharArray()){
            if(a=='#' && !tt.empty())
                tt.pop();
            else if(a!='#')
                tt.push(a);
        }
        
        if(ss.size()!=tt.size())
            return false;
        while(!ss.empty()){
            if(ss.peek()==tt.peek()){
                ss.pop();
                tt.pop();
            }
            else{
                return false;
            }
                
        }
        return true;
        
    }
}