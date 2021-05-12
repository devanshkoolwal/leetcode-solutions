class Solution {
    public String generateTheString(int n) {
        StringBuilder a=new StringBuilder();
        
        if(n%2==0)
            a.append('b');
        else
            a.append('a');
        while(n>1){
            a.append('a');
            n--;
        }
        
        
        return a.toString();
                
          
            
    }
}