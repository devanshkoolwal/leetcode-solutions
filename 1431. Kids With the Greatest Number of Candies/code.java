class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max=candies[0];
        for (int i = 1; i < candies.length; i++)
             if (candies[i] > max)
                 max = candies[i];
        
        List<Boolean> arr=new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            if((candies[i]+extraCandies)>=max){
                arr.add(true);
            }
            else
                arr.add(false);
        }
        
        return arr;
    }
}