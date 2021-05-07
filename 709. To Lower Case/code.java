class Solution {
    public String toLowerCase(String str) {
        StringBuilder ans=new StringBuilder();
        for(char a:str.toCharArray()){
            if(a>='A' && a<='Z') a+=32;
            ans.append(a);
        }
        return ans.toString();
    }
}