class Solution {
    public boolean checkIfPangram(String sentence) {
        int a[]=new int[26];
        for(int i=0;i<sentence.length();i++){
            a[sentence.charAt(i)-'a']++;
        }
        for(int b:a)
            if(b==0)
                return false;
        return true;
    }
}