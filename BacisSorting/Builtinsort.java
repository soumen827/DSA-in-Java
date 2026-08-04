package BasicSorting;
import java.util.Arrays;
public class Builtinsort {
    public static void main(String[] args) {
        int[] arr = {3,6,4,3,3,7,4,2,6,3,2,4};
        Arrays.sort(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
