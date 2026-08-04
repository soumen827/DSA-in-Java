public class car {
    int price;
    String type;
    String company;
    final int wheel = 4;
    // private static int numberofcar;

    public car() {
        
    }

    public car(String type, int price, String company ) {
        this.price = price;
        this.type = type;
        this.company = company;
         
    }

    public static void main(String[] args) {
        car x = new car("Sedan", 436, "BMW");
        System.out.println(x.company);
        System.out.println(x.price);
        System.out.println(x.wheel);
    }
}


 