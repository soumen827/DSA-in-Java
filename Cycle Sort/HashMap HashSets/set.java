import java.util.HashSet;
public class set { 
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.remove(4);
        
         
        // Search - true, false
        System.out.println(set.size());
        System.out.println(set.contains(7));
        Object[] arr =  set.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        set.clear();
        System.out.println(set);

        
    }
}
