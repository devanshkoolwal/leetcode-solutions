class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            int j=i;
            boolean ansB=true;
            while(j>0){
                int d=j%10;
                if(d==0){
                    ansB=false;
                    break;
                }
                if(i%d!=0){
                    ansB=false;
                    break;
                }
                j/=10;
            }
            if(ansB){
                ans.add(i);
            }
        }
        return ans;
    }
}