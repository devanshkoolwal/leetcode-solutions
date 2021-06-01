class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        
        if(n%2==0){
            int last=0;
            for(int i=(n/2)*-1;i<=n/2;i++){
                if(i!=0)
                    arr[last++]=i;
            }   
        }
        else{
            int last=0;
            for(int i=(n/2)*-1;i<=n/2;i++){
                arr[last++]=i;
            }
        }
        return arr;
    }
}