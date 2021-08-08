class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder a=new StringBuilder();
        for(String letter:words)
            if(a.append(letter).toString().equals(s)) return true;
        return false;
    }
}