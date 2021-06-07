class Solution {
    public boolean checkZeroOnes(String s) {
        int zero=0,one=0,z=0,o=0;
        for(char a:s.toCharArray()){
            if(a=='1'){
                o++;
                z=0;
                one=Math.max(o,one);
            }
            else{
                z++;
                o=0;
                zero=Math.max(z,zero);
            }
        }
        
        return one>zero;
    }
}
