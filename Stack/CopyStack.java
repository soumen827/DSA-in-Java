package Stack;
import java.util.Stack;
import java.util.Scanner;
public class CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(6);
        st.push(3);
        st.push(12);
        st.push(13);
         System.out.println(st);
         Stack<Integer> rt = new Stack<>();
         Stack<Integer> rrt = new Stack<>();
         while(st.size()>0){
            int x = st.peek();
            rt.push(st.pop());
            
         }
         while(rt.size()>0){
            int x = rt.peek();
            rrt.push(rt.pop());
            
         }
        //  System.out.println(rt);
         System.out.println(rrt);

    }
}
