class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String a:patterns)
            if(word.indexOf(a)!=-1)
                count++;
        return count;
    }
}