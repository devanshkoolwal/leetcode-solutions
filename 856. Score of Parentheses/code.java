class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0;
        int deapth=1;
        
        for(int i=0;i<s.length()-1;){
            if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
                ans+=deapth;
                i+=2;
            }
            else if(s.charAt(i)=='('){
                deapth*=2;
                i++;
            }
            else{
                deapth/=2;
                i++;
            }
        }
        return ans;
    }
}