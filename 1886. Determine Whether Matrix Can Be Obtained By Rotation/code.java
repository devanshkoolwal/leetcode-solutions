class Solution {
    static void rotation(int[][] mat,int n){
        for(int x=0;x<n;x++){
            for(int y=x;y<n-x-1;y++){
                int temp=mat[x][y];
                mat[x][y]=mat[y][n-1-x];
                mat[y][n-1-x]=mat[n-x-1][n-1-y];
                mat[n-x-1][n-1-y]=mat[n-1-y][x];
                mat[n-1-y][x]=temp;
            }
        }
        
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        boolean flag=true;
        for(int k=0;k<=3;k++){
            flag=true;
            
             for(int i = 0; i < n; i++){    
                for(int j = 0; j < n; j++){    
                  if(mat[i][j] != target[i][j]){    
                      flag = false;    
                      break;    
                  }
                    
                }
                 if(!flag){
                        break;
                    }
                 
            }
            if(flag){
                return true;
                 }
            rotation(mat,n);
        }
        return flag;
        }
    }
    