public class impliment {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left=b; a.right =c;
        b.left=d; b.right =e;
        c.left = f;
        display(a);
        System.out.println();
        System.out.println("Size of your Tree is: "+ size(a));
        System.out.println("Sum of the Tree: "+sum(a));
        System.out.println("product of the Tree: "+mul(a));
        System.out.println("Min number of the tree: "+Max(a));
        System.out.println("Level of the Tree: "+level(a));

    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
         
    } 
    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int mul(Node root){
        if(root==null) return 1;
        return root.val * mul(root.left) * mul(root.right);
    }
    public static int Max(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int max_value = Math.min(Math.min(root.val,Max(root.left)),Max(root.right));
        return max_value;
        
    }
     public static int level(Node root){
            if(root==null) return 0;
            return 1 + Math.max(level(root.left),level(root.right));
    }
}
