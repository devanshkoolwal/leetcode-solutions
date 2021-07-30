class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> cities=new HashSet<>();
        for(List<String> city:paths){
            cities.add(city.get(0));
        }
        for(List<String> city:paths){
            String d=city.get(1);
            if(!cities.contains(d))
                return d;
        }   
        return "";
    }
}