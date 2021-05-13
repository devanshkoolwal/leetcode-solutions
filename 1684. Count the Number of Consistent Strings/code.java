class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        
        for(String word:words){
            int c=0;
            for(char cword:word.toCharArray()){
                for(char callowed:allowed.toCharArray()){
                    if(callowed==cword){
                        c++;
                        break;
                    }
                        
                }
            }
            if(c==word.length())
                count++;
        }
        return count;
    }
}