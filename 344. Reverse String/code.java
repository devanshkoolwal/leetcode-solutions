class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int last=s.length-1;
        while(left<last){
            char a=s[left];
            s[left++]=s[last];
            s[last--]=a;
        }
    }
}