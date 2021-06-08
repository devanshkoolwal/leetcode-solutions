class Solution {
    public int reductionOperations(int[] nums) {
        int n=nums.length;
        
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        int count=0;
        
        
        nums = Arrays.stream(nums).boxed()
    .sorted(Collections.reverseOrder())
    .mapToInt(Integer::intValue)
    .toArray();
        
            int c=0;
            for(int j=n-2;j>0;j--){
                if(nums[j+1]!=nums[j]){
                    c++;
                }
                count+=c;
            }
            count+=c;
            if(nums[0]!=nums[1]){
                count++;
            }
            
        
        return count;
    }
}