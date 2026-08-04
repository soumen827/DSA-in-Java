package MargeAndQuickSort;
public class Inversion_count {
    static int count;
    public static void marge(int[] a, int[] b, int[] c){
        int x = a.length, y= b.length;
        int i=0, j=0,k=0;
        //Merging
        while(i<x && j<y){
            if(a[i]<=b[j]) c[k++] =a[i++];
            else {
            c[k++]=b[j++];
            count+=x-i;
            }
        }
        while(j<y) c[k++] = b[j++];        
        while(i<x) c[k++] = a[i++];
    }
    // public static void inversion(int[]a,int[]b){
    //       int x = a.length, y= b.length;
    //     int i=0, j=0;
    //      while (i<x && j<y){
    //         if(a[i]>b[j]){ 
    //             count+=x-i;
    //             j++;
                
    //         }else i++;
    
    //      }
    // }
    public static void margesort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int a[]= new int[n/2];
        int b[] = new int[n-n/2];
        // Devide the Array in 2 part and put the valu
        for(int i=0;i<n/2;i++){
            a[i] =arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]= arr[i+n/2];
        }
        margesort(a);
        margesort(b);
        // inversion(a,b);
        // maege this a ans b 
        marge(a,b,arr);
        a= null; b= null;
    }
     public static void print(int [] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
     }
     public static void main(String[] args) {
        int[] arr ={8,2,5,3,1,4};
        print(arr);
        margesort(arr);
        print(arr);
        System.out.print("Total no of Inversions: ");
        System.out.println(count);
     }
    
}
