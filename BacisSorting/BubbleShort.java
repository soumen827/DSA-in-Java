package BasicSorting;
public class BubbleShort{
   public static void print( int[] arr){
      for(int ele: arr){
         System.out.print(ele+" ");
      }
      System.out.println();
   }
   public static void main(String[] args){
      int[] arr ={0,0,7,8,6,4,6,36,7,7,4,2,11,5,7,9,0,7,4,47,36,87,36,367,55,3,2,3,5};
      print(arr);
      int n = arr.length;
      for(int j=0;j<n-1;j++){ // n-1 passes
         boolean flage =true;
       for(int i=0;i<n-1-j;i++){
         if(arr[i]>arr[i+1]){
            int tamp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1]= tamp;
            flage = false;
         }
       }
       if(flage== true) break;
      }
      print(arr);
      }
   }
     
    

