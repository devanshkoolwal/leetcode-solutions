class Solution {
    public char findTheDifference(String s, String t) {
        int arr[]=new int[26];
        for(char a:s.toCharArray()){
            arr[a-'a']++;
        }
        for(char a:t.toCharArray()){
            arr[a-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                char ans=(char)('a'+i);
                return ans;
            }
        }
        return '0';
    }
}