import java.util.HashMap;
public class Iterate {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();
        map.put("Soumen",83);
        map.put("Arka",90);
        map.put("Manna",81);
        map.put("Trideep",82);
        map.put("Rahul",89);
        //System.out.println(map.keySet());
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
            
        }
    }
}
