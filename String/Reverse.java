package StringBuilders;
import java.util.*;
public class Reverse {
    public static void reverse(StringBuilder s, int i,int j){
        while(i<=j){
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;j--;
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your String: ");
    StringBuilder s = new StringBuilder(sc.nextLine());
    // sc.close();
      int i=0,j=0;
      int n = s.length();
      while(j<n){
        if(s.charAt(j)!=' '){
            j++;
        }else{
             reverse(s, i, j-1);
             i=j+1;
             j=i;
        }
      }
      reverse(s, i, j-1);
      System.out.println("Reverse code is: "+s);
    }
}
 