package Stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class LinkedListImplementation {
    public static class Stack{
       private Node head = null;
       private int size =0;

       void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
       }
       int pop(){
        if(head==null){
            System.out.println("Stack is Empty ");
            return -1;
        }
         int x = head.val;
        head = head.next;
        return  x;
        
       }
       int peek(){
        if(head==null){
            System.out.println("Stack is Empty ");
            return -1;
        }
        return head.val;
       }
        
       void Display(){
        DisplayRec(head);
        System.out.println();
         
       }
       void DisplayRec(Node head){
        if(head==null) return ;
        DisplayRec(head.next);
         System.out.print(head.val+" ");

       }
      void ReverseDisplay(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
      }
       int size(){
        return size;
       }
       boolean isEmpty(){
        if(size==0) return true;
        else return false;
       }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(4);
        st.Display();
        System.out.println(st.size());
        st.pop();
        st.Display();
        st.push(5);
        st.push(6);
        st.push(7);
        st.Display();
        System.out.println(st.isEmpty());
        st.push(23);
        st.Display();
        st.ReverseDisplay();
        
        
    }
}
