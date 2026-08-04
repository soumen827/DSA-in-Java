package Stack;
import java.util.Stack;
import java.util.Scanner;
public class Q1_FollowUp {
    public static int isBalanced(String str){
        Stack<Character> st = new Stack();
        int remove =0;
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch =str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0) remove++;
                else st.pop();
                    
                }
            
        }
        remove+=st.size();
        return remove;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of Misspeir ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));

    }
}
