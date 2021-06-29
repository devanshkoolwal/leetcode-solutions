class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Long> arr=new ArrayList<>();
        Long total=0l;
        for(String a:ops){
            Long value=0l;
            switch(a){
                case "+":
                    value=arr.get(arr.size()-2)+arr.get(arr.size()-1);
                    arr.add(value);
                    total+=value;
                    break;
                case "D":
                    value=2*arr.get(arr.size()-1);
                    arr.add(value);
                    total+=value;
                    break;
                case "C":
                    value=arr.get(arr.size()-1);
                    arr.remove(arr.size()-1);
                    total-=value;
                    break;
                default:
                    value =Long.parseLong(a);
                    arr.add(value);
                    total+=value;
                    break;
            }
        }
        return total.intValue();
    }
}