public class Soumen {
    public void area(double r){
        double area = Math.PI*r*r;
        System.out.println(area);
    }
    public void perimeter(double r){
        double peri = 2*Math.PI*r;
        System.out.println(peri);
    }
    public static void main(String[] args) {
        Soumen obj = new Soumen();
        double redius = 7.0;
        obj.area(redius);
        obj.perimeter(redius);
        
    }
    
}
