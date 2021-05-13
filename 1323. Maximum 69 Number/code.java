class Solution {
    public int maximum69Number (int num) {
        String a=Integer.toString(num);
        StringBuilder string = new StringBuilder(a);
        if(a.indexOf('6')!=-1)
            string.setCharAt(a.indexOf('6'),'9');
        return Integer.valueOf(string.toString());
    }
}