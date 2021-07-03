class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        for(int i=n;i>=0;i--){
            digits[i]++;
            if(digits[i]<=9){
                return digits;
            }
            digits[i]=0;
        }
        int res[]=new int[n+2];
        res[0]=1;
        return res;
    }
}