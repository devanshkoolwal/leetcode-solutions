class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int d=x;
        int num=0;
        while(d!=0){
            num=num*10+d%10;
            d/=10;
        }
        return num==x;
        
    }
}