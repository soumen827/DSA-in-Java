package Method;

import java.util.Scanner;

public class N_factorial {
    public static int fact(int x){
        int xFact =1;
        for(int i=1;i<=x;i++){
            xFact*=i;
        }
        return xFact ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your N:");
        int n = sc.nextInt();
        System.out.print("Enter your R:");
        int r = sc.nextInt();

         
         
        int ncr =  fact(n)/(fact(r)*fact(n-r));
        System.out.print("Your ncr is : ");
        System.out.println(ncr);
        int npr = fact(n)/fact(n-r);
        System.out.print("Your npr is: ");
        System.out.println(npr);
    }
}
