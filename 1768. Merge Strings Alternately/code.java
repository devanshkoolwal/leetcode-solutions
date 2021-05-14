class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder a=new StringBuilder();
        int l1=word1.length();
        int l2=word2.length();
        int i1=0,i2=0;
        
        for(int i=0;i<Math.min(l1,l2);i++){
            a.append(word1.charAt(i1));
            a.append(word2.charAt(i2));
            i1++;i2++;
        }
        a.append((l1>l2)?word1.substring(i1,l1):word2.substring(i2,l2));
        return a.toString();
        
    }
}