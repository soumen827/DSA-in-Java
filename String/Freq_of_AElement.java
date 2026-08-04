import java.util.Scanner;
public class Freq_of_AElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        System.out.print("Enter your Target Element: ");
        char ch = sc.next().charAt(0);
        int count =0;
        for(int i=0;i<str.length();i++){
            if(ch ==str.charAt(i)){
                count++;
            }
        }
        System.out.println("Freq of "+ch+" is = "+count);
    }
}
