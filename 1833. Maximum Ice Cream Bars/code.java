class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int i=0;
        while(i<costs.length){
            if(costs[i]<=coins){
                count++;
                coins-=costs[i];
                i++;
            }
            else
                return count;
        }
        return count;
    }
}