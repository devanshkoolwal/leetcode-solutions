class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int ans[]=new int[A.length];
        int j=A.length-1;
        int k=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0)
                ans[k++]=A[i];
            else
                ans[j--]=A[i];
        }
        return ans;
    }
}