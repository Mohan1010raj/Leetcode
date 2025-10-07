class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> m=new HashMap<>();
        for(List<String> cities:paths){
            m.put(cities.get(0),cities.get(1));
        }
        for(String city:m.values()){
            if(!m.containsKey(city)){
                return city;
            }
        }
        return "";
    }
}