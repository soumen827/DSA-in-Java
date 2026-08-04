import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(9);
        set.add(1);
        set.add(11);
        set.add(5);
        set.add(2);
        set.remove(9);
        System.out.println(set);
        for(int ele:set){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println(set.contains(9));
    }
}
