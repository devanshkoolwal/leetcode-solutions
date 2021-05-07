class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index=2;
        int count=0;
        if(ruleKey.equals("type")) index=0;
        if(ruleKey.equals("color")) index=1;
            
        for(List s:items){
            if(s.get(index).equals(ruleValue))
                count++;
        }
        return count;
    }
}