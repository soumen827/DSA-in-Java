package Stack;
import java.util.*;
import java.util.Stack;
public class Q1_Balanced {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()==0) return true;
       return false;
         

    }
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Bracker: ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
    
}
