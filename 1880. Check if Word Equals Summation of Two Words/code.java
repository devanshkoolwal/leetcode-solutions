class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int a=0;
        for(char i:firstWord.toCharArray()){
            a=a*10;
            a+=i-'a';
        }
        int b=0;
        for(char i:secondWord.toCharArray()){
            b=b*10;
            b+=i-'a';
        }
        int c=0;
        for(char i:targetWord.toCharArray()){
            c=c*10;
            c+=i-'a';
        }
        
        
        if((a+b)==c)
            return true;
        return false;
    }
}