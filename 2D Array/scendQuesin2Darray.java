package MultidimensionalArray;

public class scendQuesin2Darray {
    public static void main(String[] args){
       int [][] arr = {{65,65,43},{56,75,35},{87,96,47},{97,533,36}};
        int m = arr.length;
        int n= arr[0].length;
        int mx= Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<m;i++){
            for(int j= 0;j<n;j++){
                mx = Math.max(mx,arr[i][j]);
                 sum+= arr[i][j];
            }
        }
        System.out.println("The max valu of this arry is: "+mx);
        System.out.println("The total sum of this array is : "+sum);
        
    }
    
}
