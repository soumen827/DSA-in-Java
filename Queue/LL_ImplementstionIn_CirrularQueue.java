package Queue;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val= val;
    }
}
public class LL_ImplementstionIn_CirrularQueue {
    public static class Cqueue{
        Node head = null;
        Node tail = null;
        int size =0;
        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head=tail= temp;
                // temp.next = head;
            }else{
                tail.next=temp;
                tail= temp;
                tail.next = head;
             }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }else{
                int x = head.val;
                head = head.next;
                tail.next = head;
                size--;
                return x;
            }
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }
            return head.val;
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
             if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            while(true){
                System.out.print(temp.val+" ");
                temp = temp.next;
                if(temp==head) break;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Cqueue q = new Cqueue();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
    
}
