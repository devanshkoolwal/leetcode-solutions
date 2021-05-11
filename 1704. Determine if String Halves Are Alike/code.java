class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int size=s.length();
        int c1=0,c2=0;
        for(int i=0;i<size/2;i++){
            char a=s.charAt(i);
            char b=s.charAt(i+(size/2));
            if(a=='a' || a=='e' || a=='i' ||a=='o' ||a=='u')
                c1++;
            if(b=='a' ||b=='e' || b=='i' ||b=='o' ||b=='u')
                c2++;
            
            
        }
        if(c1==c2)
            return true;
        return false;
    }
}