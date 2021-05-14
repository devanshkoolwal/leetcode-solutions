class Solution {
    public String reverseWords(String s) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        
        for(char c:s.toCharArray()){
            if(c==' '){
                b.reverse();
                a.append(b);
                a.append(c);
                b.delete(0,b.length());
            }
            else{
                b.append(c);
            }
        }
        a.append(b.reverse());
        return a.toString();
    }
}