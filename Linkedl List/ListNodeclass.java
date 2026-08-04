package LinkdList;
class Node{
        int  valu;
        Node next;
        
          Node(int valu){
            this.valu = valu;  
        }
    }
 public class ListNodeclass {

    public static void main(String[] args) {
    Node n1 = new Node(5);
    Node n2 = new Node(15);
    Node n3 = new Node(25);
    Node n4 = new Node(35);
    Node n5 = new Node(45);
    Node n6 = new Node(55);
    n1.next =n2; //5->15
    n2.next = n3; // 5->15->25
    n3.next = n4; // 5->15->25->35
    n4.next =n5;  // 5->15->25->35->45
    n5.next= n6;  // 5->15->25->35->45->55
    n6.next =n1;
    System.out.println(n1.valu);
    System.out.println(n1.next.valu);
    System.out.println(n1.next.next.valu);
    System.out.println(n1.next.next.next.valu);
    System.out.println(n1.next.next.next.next.valu);
    System.out.println(n1.next.next.next.next.next.valu);
    System.out.println(n1.next.next.next.next.next.next.valu);


    }
}
