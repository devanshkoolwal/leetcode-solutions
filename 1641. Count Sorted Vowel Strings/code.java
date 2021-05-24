class Solution {
    public int countVowelStrings(int n) {
        int a=1,e=1,i=1,o=1,u=1;
        for(int j=2;j<=n;j++){
            u=a+e+i+o+u;
            o=a+e+i+o;
            i=a+e+i;
            e=a+e;
         }
        return a+e+i+o+u;
    }
}