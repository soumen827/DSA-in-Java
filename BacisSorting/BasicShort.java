package BasicSorting;
public class BasicShort {
    public static void main(String[] args){
        int[] arr ={1,3,4,4,5,5,6,77,};
        boolean flage = true;
        int n =arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flage = false;
                break;
            }
        }
        if(flage==true) System.out.println("The Array is Sorted");
        else System.out.println("The Array is Unsorted");
    }
}
