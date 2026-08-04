import javax.sql.rowset.serial.SQLInputImpl;

public class args {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        int sum = a+b;
        System.out.println("First number="+a);
         System.out.println("Second number="+b);
          System.out.println("Sum="+sum);
    }
}
