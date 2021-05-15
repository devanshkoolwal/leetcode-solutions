class Solution {
    public char[][] rotateTheBox(char[][] box) {
        char arr[][]=new char[box[0].length][box.length];
        int k=box[0].length;
        for(char ar[]:box){
            for(int i=ar.length-1;i>0 && k>0;i--){
                if(ar[i]=='.' && (ar[i-1]=='#' || ar[i-1]=='.')){
                    char swap=ar[i];
                    ar[i]=ar[i-1];
                    ar[i-1]=swap;
                }
                if(i==1){
                    i=ar.length;
                    
                    k--;
                }
            }
            k=box[0].length;
        }
        
        
        int rows=box.length;
        int cols=box[0].length;
        for ( int r = 0; r < rows; r++ ) {
            for ( int c = 0; c < cols; c++ ) {
                arr[ c ][ rows - 1 - r ] = box[ r ][ c ];
            }
        }
        return arr;
    }
}