class Solution {
    public int minSteps(String s, String t) {
        int count=0;
        char arr[]=new char[26];
        for(char a:s.toCharArray()){
            arr[a-'a']++;
        }
        for(char a:t.toCharArray()){
            if(arr[a-'a']!=0)
                arr[a-'a']--;
            else{
                count++;
            }
        }
        return count;
    }
}