class Solution {
    public int minDeletionSize(String[] strs) {
        char arr[][]=new char[strs.length][];
        
        for(int i=0;i<strs.length;i++){
            arr[i]=strs[i].toCharArray();
        }
        
        int count=0;
        for(int i=0;i<arr[0].length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j][i]<arr[j-1][i]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}