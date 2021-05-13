class Solution {
    public String freqAlphabets(String s) {
        char a[]=s.toCharArray();
        StringBuilder str=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if((a[i]=='1' || a[i]=='2') && (n-i)>2){
                if(a[i+2]=='#'){
                    int ch=(Character.getNumericValue(a[i])*10)+Character.getNumericValue(a[i+1]);
                    str.append(Character.toChars('`'+ch));
                    i=i+2;
                }
                else{
                    int ch=Character.getNumericValue(a[i]);
                    str.append(Character.toChars('`'+ch));
                }
            }
            else{
                int ch=Character.getNumericValue(a[i]);
                str.append(Character.toChars('`'+ch));
            }
        }
        return str.toString();
    }
}