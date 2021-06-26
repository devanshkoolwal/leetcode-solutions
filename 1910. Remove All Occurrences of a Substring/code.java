class Solution {
    public String removeOccurrences(String s, String part) {
        int pl=part.length();
        for(int i=0;i<=s.length()-pl;i++)
            if(part.equals(s.substring(i,i+pl))){
                s=s.substring(0,i)+s.substring(i+pl);
                i=(i>=pl)?i-pl:-1;
            }
        return s;
    }
}