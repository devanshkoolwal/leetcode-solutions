class Solution {
    public boolean areOccurrencesEqual(String s) {
        int arr[]=new int[26];
        for(char a:s.toCharArray())
            arr[a-'a']++;
        int check=0;
        
        for(int i=0;i<26;i++){
            if(arr[i]==0) continue;
            if(check==0) check=arr[i];
            if(arr[i]!=check) return false;
        }
        return true;
    }
}