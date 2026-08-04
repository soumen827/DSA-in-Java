package Queue;
import java.util.*;
public class Deque_STL {
    public static void main(String[] args) {
        Deque<Integer> de = new  ArrayDeque<>();
        de.addLast(1);
        de.addLast(2);
        de.addLast(3);
        de.addLast(4);
        System.out.println(de);
        de.addFirst(5);
        System.out.println(de);
        de.addLast(7);
        System.out.println(de);
        System.out.println(de.getFirst());
        System.out.println(de.peekLast());

    }
    
}
