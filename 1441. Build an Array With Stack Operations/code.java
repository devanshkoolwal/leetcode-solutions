class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<String>();
        int counter=0;
        for(int i=0;i<target[n-1];i++){
            if(target[counter]==i){
                ans.add("Push");
                counter++;
            }
            else{
                for(int j=i;j<=target[counter];j++){
                    ans.add("Push");
                    ans.add("Pop");
                    i++;
                }
            }
        }
        return ans;
    }
}