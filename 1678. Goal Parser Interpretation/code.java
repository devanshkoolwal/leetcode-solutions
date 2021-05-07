class Solution {
    public String interpret(String command) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)=='a'){
                    ans.append("al");
                    i+=3;
                }
                else{
                    ans.append("o");
                    i++;
                }
            }
            else
                ans.append("G");
        }
        
        return ans.toString();
    }
}