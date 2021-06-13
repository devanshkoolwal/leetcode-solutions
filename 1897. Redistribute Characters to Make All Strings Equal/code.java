class Solution {
    public boolean makeEqual(String[] words) {
        int arr[]=new int[26];
        
        for(String a:words){
            for(char b:a.toCharArray()){
                arr[b-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                continue;
            }
            else if(arr[i]%words.length!=0){
                return false;
            }
        }
        
        return true;
    }
}