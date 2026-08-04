package Stack;
import java.util.Stack;
public class BasicStack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);
        st.pop();
        while(st.size()>2){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
       
        System.out.println(st );
    }
}
