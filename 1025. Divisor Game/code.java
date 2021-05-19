class Solution {
    public boolean divisorGame(int n) {
        
        int counter=0;
         while(n>1){
             for(int i=1;i<n;i++){
                 if(n%i==0){
                     n=n-i;
                     
                     counter++;
                     break;
                 }
             }
         }
        if(counter%2==0){
            return false;
        }
        return true;
    }
}