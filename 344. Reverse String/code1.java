class Solution {
    public void reverseString(char[] s) {
        int last=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char a=s[i];
            s[i]=s[last];
            s[last--]=a;
        }
    }
}