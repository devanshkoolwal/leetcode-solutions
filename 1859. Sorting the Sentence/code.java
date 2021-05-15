class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        StringBuilder st=new StringBuilder();
        String ans[]=new String[str.length];
        
        for(String a:str){
            ans[Character.getNumericValue(a.charAt(a.length()-1))-1]=a.substring(0,a.length()-1);
        }
        for(String b:ans){
            st.append(b);
            st.append(" ");
        }
        st.deleteCharAt(st.length()-1);
        return st.toString();
    }
}