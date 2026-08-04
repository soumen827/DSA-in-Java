import java.util.Scanner;
public class substring {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
     }
}
