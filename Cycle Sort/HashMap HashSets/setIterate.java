import java.util.HashSet;

public class setIterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        int[] arr = {3,5,6,7,3,6,9};
        set.add(1);
        set.add(2);
        set.add(8);
        set.add(4);
        set.add(4);
        set.add(6);
         System.out.println(set);
          
        for(int ele: set){
            System.out.print(ele+" ");
        }
    }
}
