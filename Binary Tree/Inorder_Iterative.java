import java.util.Stack;

public class Inorder_Iterative {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Stack<Node> st = new Stack<>();
        a.left=b; a.right =c;
        b.left=d; b.right =e;
        c.left =f; c.right =g;
        Node temp = a;
        System.out.print("Inorder Travelsal: ");
        while(true){
            if(temp!=null){
                st.push(temp);
                temp = temp.left;
            }
            else{
                if(temp==null && st.isEmpty()) break;
                Node top = st.pop();
                System.out.print(top.val+" ");
                temp = top.right;
            }
        }

    }
}
