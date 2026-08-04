import java.util.ArrayList;
import java.util.List;
public class Permutations {
    public static void permutations(String str, String t, List<String> l){
        if(str.isEmpty()){
            l.add(t);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i); //b
            String left = str.substring(0,i);//a
            String right = str.substring(i+1);//c
            String rem = left + right; //ac
            permutations(rem, t+ch,l);

        }
    } 
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String str ="abc";
        permutations(str,"",l);
        for(String ele:l){
            System.out.println(ele);
        }
    }
}
