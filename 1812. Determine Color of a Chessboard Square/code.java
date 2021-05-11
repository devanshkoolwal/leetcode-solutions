class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(0);
        int b=Character.getNumericValue(coordinates.charAt(1));
        
        if(a%2==0 && b%2==0 || a%2!=0 && b%2!=0)
            return false;
        
        return true;
            
    }
}