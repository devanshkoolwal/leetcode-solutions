class Solution {
    public int[] memLeak(int memory1, int memory2) {
        int count=0;
        int ans[]=new int[3];
        while(memory1>=(count+1) || memory2>=(count+1)){
            count++;
            if(memory1>=memory2){
                memory1-=count;
            }
            else{
                memory2-=count;
            }
        }
        ans[0]=count+1;
        ans[1]=memory1;
        ans[2]=memory2;
        return ans;
        
    }
}