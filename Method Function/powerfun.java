 package Method;
import java.util.Scanner;
public class powerfun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your base:");
        Double a= sc.nextDouble();
        System.out.print("Enter your power: ");
        Double b = sc.nextDouble();
        System.out.println("Your powar is: ");
          System.out.println(Math.pow(a,b));
          System.out.println(Math.sqrt(a));
          System.out.println("//");
          System.out.println(Math.max(Math.max(Math.max(a,9),12),Math.max(Math.max(6,b),10)));
          System.out.println(Math.min(8,4));
          System.out.println(Math.ceil(5.7));
    }
}
