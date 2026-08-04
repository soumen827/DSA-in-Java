import java.util.HashMap;
public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Soumen",83);
        map.put("Arka",90);
        map.put("Manna",81);
        map.put("Trideep",82);
        map.put("Rahul",89);
        
        System.out.println(map+" "+map.size());
        map.put("Soumen",100);
        System.out.println(map+" "+map.size());
        map.put("Harshit", 90);
        System.out.println(map+" "+map.size());
        map.remove("Arka");
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Soumen"));
 
         
    }
}
