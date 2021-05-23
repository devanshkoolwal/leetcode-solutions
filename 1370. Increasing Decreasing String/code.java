class Solution {
    public String sortString(String s) {
        StringBuilder ans=new StringBuilder();
        int arr[]=new int[26];
        
        for(char a:s.toCharArray()){
            arr[a-'a']++;
        }
        
        for(int j=0;j<s.length();j++){
            
            int i=0;
            while(i<26){
                if(arr[i]!=0){
                    ans.append((char)(i+'a'));
                    arr[i]--;
                }
                i++;
            }
            i=25;
            while(i>=0){
                if(arr[i]!=0){
                    ans.append((char)(i+'a'));
                    arr[i]--;
                }
                i--;
            }
        }
        
        return ans.toString();
    }
}