class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num=0;
        for(char a:stones.toCharArray()){
            if(jewels.indexOf(a)!=-1){
                num++;
            }
        }
        return num;
    }
}