package MultidimensionalArray;
   import java.util.*;

public class TwoDarraylist {
    public static void main(String[] args) {
        /// AttayList
       List<Integer> a = new ArrayList<>();
       a.add(10); a.add(20);a.add(30);
       List<Integer> b = new ArrayList<>();
       b.add(40);b.add(50);
       ArrayList<Integer> c = new ArrayList<>();
       ArrayList<Integer> d = new ArrayList<>();
       d.add(60);  
        // 2D ArrayList
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);l.add(b);l.add(c); l.add(d);
           
        for (int i = 0; i < l.size(); i++) {
            List<Integer> x = l.get(i);
            for (int j = 0; j <  x.size(); j++) {
                System.out.print( x.get(j)+" ");
            }
            System.out.println();
        }
        // System.out.println(l.get(0).get(2));

    }
}
