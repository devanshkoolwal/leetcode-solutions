class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int arr[]=new int[26];
        int count=0;
        for(char a:allowed.toCharArray())
            arr[a-'a']++;
        
        for(String word:words){
            count++;
            for(char a:word.toCharArray()){
                if(arr[a-'a']<=0){
                    count--;
                    break;
                }
                    
            }
        }
        return count;
    }
}