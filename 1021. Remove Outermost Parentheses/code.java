class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder s=new StringBuilder();
        int count=1;
        char a[]=S.toCharArray();
        for(int i=1;i<a.length;i++){
            if(count==0){
                count++;
                continue;
            }
            if(a[i]=='('){
                count++;
                s.append('(');
            }
            else{
                count--;
                if(count==0){
                    continue;
                }
                else
                    s.append(')');
            }
        }
        return s.toString();
    }
}