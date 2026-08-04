package Stack;
import java.util.Stack;
public class ReverseStack {
    public static void InsertAtBotton(Stack<Integer>st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
       int top = st.pop();
       InsertAtBotton(st,x);
       st.push(top);
    }
    public static void Reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top =st.pop();
        Reverse(st);
        InsertAtBotton(st,top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // Stack<Integer> rt = new Stack<>();
        // Stack<Integer> at = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Reverse(st);
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // while(rt.size()>0){
        //     at.push(rt.pop());
        // }
        // while(at.size()>0){
        //     st.push(at.pop());
        // }
        System.out.println(st);
    }
    
}
