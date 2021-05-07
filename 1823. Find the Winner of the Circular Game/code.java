class Solution {
    public int findTheWinner(int n, int k) {
    
        return findThe(n,k)+1;
    }
    
    public int findThe(int n, int k){
        if(n==1)
            return 0;
        else
            return (findThe(n-1,k)+k)%n;
    }
}