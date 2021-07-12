class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr=new Stack();
        if(s.length()%2!=0)
            return false;
        
        for(char a:s.toCharArray()){
            if(a=='(' || a=='{' || a=='['){
                arr.push(a);
            }
            else if(!arr.isEmpty()){
                
                if(a==')'){
                    if(arr.pop()!='(')
                        return false;
                }
                else if(a=='}'){
                    if(arr.pop()!='{')
                        return false;
                }
                else if(a==']'){
                    if(arr.pop()!='[')
                        return false;
                }
                        
            }
            else
                return false;
        }
        return arr.isEmpty();
    }
}