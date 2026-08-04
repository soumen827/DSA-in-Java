package Recursion;
public class functioncCall {
    public static void sourav(){
        System.out.println("Hello i am sourav");
    }
    public static void Rohit(){
        System.out.println("Hello My name is Rohit");
        sourav();
        
    }
    public static void sovon(){
        System.out.println("Hello my Name is Sovon");
        Rohit();
        
    }
    public static void main(String[] args) {
        System.out.println("Hello my name is Soumen ");
        sovon();
        System.out.println("Rohit");
        Rohit();
    }   
}
