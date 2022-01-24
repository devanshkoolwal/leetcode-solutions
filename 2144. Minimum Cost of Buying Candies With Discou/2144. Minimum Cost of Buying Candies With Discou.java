class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==1) return cost[0];
        if(cost.length==2) return cost[0]+cost[1];
        int ans=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            ans+=cost[i--];
            ans=i>=0?ans+cost[i--]:ans;
            }
        return ans;
    }
}