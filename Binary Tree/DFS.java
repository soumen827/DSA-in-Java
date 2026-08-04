public class DFS {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left=b; a.right =c;
        b.left=d; b.right =e;
        c.left =f; 
        Preorder(a);
        System.out.println();
        Inorder(a);
        System.out.println();
        Postorder(a);
         
    }
    public static void Preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        Preorder(root.left);
        Preorder(root.right);
         
    } 
    public static void Inorder(Node root){
        if(root==null) return;
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
         
    } 
    public static void Postorder(Node root){
        if(root==null) return; 
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val+" ");
         
    } 
}
