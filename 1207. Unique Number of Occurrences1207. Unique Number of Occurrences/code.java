class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> a=new HashMap();
        for(int b:arr){
            if(a.containsKey(b)){
                a.put(b,a.get(b)+1);
            }
            else{
                a.put(b,1);
            }
        }
        
        Set<Object> uniqueValues = new HashSet<Object>(a.values());
        if(uniqueValues.size()==a.size()){
            return true;
        }
        else return false;
    }
}