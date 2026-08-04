package StringBuilders;
import java.util.Scanner;
public class FriquencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int[] friq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            int idx =  (int)ch - 97;
            friq[idx]++;
        }
        int maxfriq =-1;
        for (int i = 0; i < friq.length; i++) {
            maxfriq = Math.max(maxfriq,friq[i]);
        }
        for (int i = 0; i<friq.length; i++) {
            if(friq[i]==maxfriq){
                char ch = (char)(i+97);
                System.out.println(ch);
            }
        }
    }
}
