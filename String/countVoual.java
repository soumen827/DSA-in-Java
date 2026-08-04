import java.util.*;
class countVoual {
    public static boolean isvowel(char ch){
        if(ch=='a'|| ch=='A') return true;
        if(ch=='e'|| ch=='E') return true;
        if(ch=='i'|| ch=='I') return true;
        if(ch=='o'|| ch=='O') return true;
        if(ch=='u'|| ch=='U') return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s= sc.nextLine();
        int n = s.length();
        
        int count =0;
        for( int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(isvowel(ch) == true) count++;
        }
        System.out.println(count);
    }
}
     