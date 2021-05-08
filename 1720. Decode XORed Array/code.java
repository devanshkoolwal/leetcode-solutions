class Solution {
    public int[] decode(int[] encoded, int first) {
        int ans[]=new int[encoded.length+1];
        ans[0]=first;
        for(int i=0;i<encoded.length;i++){
            int counter=0;
            while(true){
                int xor=ans[i]^counter;
                if(xor==encoded[i]){
                    ans[i+1]=counter;
                    break;
                }
                else
                    counter++;
            }
        }
        return ans;
    }
}