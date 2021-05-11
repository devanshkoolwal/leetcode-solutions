class Solution {
    public int xorOperation(int n, int start) {
        int xorvalue=start;
        for(int i=start+2;n>1;i+=2){
            xorvalue=xorvalue^(i);
            System.out.print(i+" ");
            n--;
        }
        return xorvalue;
    }
}