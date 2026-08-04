import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("Soumen", 83);
         
        map.put("Treideep", 82);
        map.put("Manna", 81);
        map.put("Rahul", 89);
        map.put("arka", 90);
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
}
