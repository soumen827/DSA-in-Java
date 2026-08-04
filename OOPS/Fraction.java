
public class Fraction {
    public static fraction add(fraction f1, fraction  f2){
        int numaritor = f1.num*f2.den + f1.den*f2.num;
        int dinominator = f1.den*f2.den;
        fraction f3 = new fraction(numaritor, dinominator);
        return f3;
    }
    public static int  gcd(int num,int den){
        int min = Math.min(num,den);
        for(int i=min;i>=0;i--){
            if(num%i==0 && den%i==0) return i;
        }
        return min;
    }
    public static class fraction {
        int num;
        int den;
        public fraction(int num,int den){
            this.num = num;
            this.den=den;
             simplify();
        }
       
        public void simplify(){
           int hcf =gcd(num,den);
           num/= hcf;
           den/=hcf; 

        }
    }
    
   public static void main(String[] args) {
        fraction f1 = new fraction(28, 144);
        System.out.println(f1.num+"/"+f1.den);
        fraction f2 = new fraction(35, 100);
        System.out.println(f2.num+"/"+f2.den);
        System.out.print("The add of this two :");
        fraction f3 = add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
 
         

   }
}
