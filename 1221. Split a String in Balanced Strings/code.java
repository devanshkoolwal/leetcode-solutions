class Solution {
    public int balancedStringSplit(String s) {
        
        int l=0,r=0,count=0;
        for(char a:s.toCharArray()){
            if(a=='L')l++;
            else r++;
            if(l==r){
                count++;
                l=r=0;
                
            }
        }
        return count;
    }
}