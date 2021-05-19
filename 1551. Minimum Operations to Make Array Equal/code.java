class Solution {
    public int minOperations(int n) {
        return (n%2==0)?(int)Math.pow(n/2,2):(n/2)*((n/2)+1);
    }
}