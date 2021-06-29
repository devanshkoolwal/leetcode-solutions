class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Long> arr=new ArrayList<>();
        Long total=0l;
        for(String a:ops){
            Long value=0l;
            
            if(a.equals("+")){
                value=arr.get(arr.size()-2)+arr.get(arr.size()-1);
                arr.add(value);
                total+=value;
            }
            else if(a.equals("D")){
                value=2*arr.get(arr.size()-1);
                arr.add(value);
                total+=value;
            }
            else if(a.equals("C")) {
                value=arr.get(arr.size()-1);
                arr.remove(arr.size()-1);
                total-=value;
            }
            else{
                value =Long.parseLong(a);
                arr.add(value);
                total+=value;
            }
            
        }
        return total.intValue();
    }
}