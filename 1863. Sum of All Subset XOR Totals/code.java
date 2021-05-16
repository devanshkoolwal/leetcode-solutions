class Solution {
    public int subsetXORSum(int[] nums) {
        int len=nums.length;
        int xor=0;
        
        for(int i=0;i<(1<<len);i++){
            int xorSum=0;
            for(int j=0;j<len;j++){
                if((i&(1<<j))>0){
                    xorSum=xorSum^nums[j];
                    
                }
            }
            
            xor+=xorSum;
        }
        
        
        
        return xor;
    }
}