class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums) map.put(num, map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> nmap : map.entrySet()){
            if(nmap.getValue()==1){
                if(!map.containsKey(nmap.getKey()+1) && !map.containsKey(nmap.getKey()-1)) result.add(nmap.getKey());
            }
        }
        return result;
            
    }
}