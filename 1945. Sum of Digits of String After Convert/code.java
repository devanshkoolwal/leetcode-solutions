class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str=new StringBuilder();
        for(char a:s.toCharArray()){
            str.append((a-'a')+1);
        }
        int ans=0;
        s=str.toString();
        for(int i=0;i<k;i++){
            ans=0;
            for(char a:s.toCharArray()){
                ans+=Character.getNumericValue(a);
            }
            s=String.valueOf(ans);
        }
        return ans;
    }
}