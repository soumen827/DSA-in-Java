package StringBuilders;

public class Deleteandinsert {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Soumen Laha");
        System.out.println(s);
        s.delete(1,3);
        System.out.println(s);
        s.insert(1,"ou");
        System.out.println(s);

    }
}
