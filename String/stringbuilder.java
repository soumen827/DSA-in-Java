package StringBuilders;
import java.util.*;
public class stringbuilder {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s =new StringBuilder(sc.nextLine());
        System.out.println(s);
        s.append( " 10");
        System.out.println("your new String is: ");
        System.out.println(s);
        s.append("*");
        System.out.println(s);
         StringBuilder t= new StringBuilder("Laha");
         s.append(t);
         System.out.println(s);
         
    }
}
  