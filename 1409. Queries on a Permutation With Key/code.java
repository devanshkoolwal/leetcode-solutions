class Solution {
    public int[] processQueries(int[] queries, int m) {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        int ans[]=new int[queries.length];
        for(int i=1;i<=m;i++)
            nums.add(i);
        
        for(int i=0;i<queries.length;i++){
            int index=nums.indexOf(queries[i]);
            ans[i]=index;
            nums.remove(index);
            nums.add(0,queries[i]);
            }
        return ans;
    }
}