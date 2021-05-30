class Solution {
    public int countGoodSubstrings(String s) {
        char arr[]=s.toCharArray();
        int count=0;
        for(int i=0;i<=arr.length-3;i++){
            char st[]=new char[3];
            for(int j=i;j<i+3;j++)
                st[j-i]=arr[j];
            if(st[0]==st[1] || st[0]==st[2] || st[1]==st[2]){
                continue;
            }
            else
                count++;
        }
        return count;
    }
}