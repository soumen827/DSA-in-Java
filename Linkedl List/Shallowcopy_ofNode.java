package LinkdList;
public class Shallowcopy_ofNode {
    public static void displayrecursively(Node head){
        if(head==null) return;
         System.out.println(head.valu);
         displayrecursively(head.next);
        
     }

    // public static void print(Node a){
    //     Node temp = a;
    //     while(temp!=null){
    //         System.out.println(temp.valu);
    //         temp = temp.next;
    //      }
    // }

    
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(15);
        Node c = new Node(25);
        Node d = new Node(35);
        Node e = new Node(45);
        Node f = new Node(55);
        a.next =b; 
        b.next = c; 
        c.next = d; 
        d.next =e;  
        e.next= f;   
        displayrecursively(a);  
      
    }
}
