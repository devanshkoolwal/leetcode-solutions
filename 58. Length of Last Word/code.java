class Solution {
    public int lengthOfLastWord(String s) {
        String[] splited = s.split(" ");
        if(splited.length==0)
            return 0;
        return splited[splited.length-1].length();
    }
}