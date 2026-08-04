class student{
        int roll;
        String name; 
        String Strem;
    }
public class StudentClass {
    public static void main(String[] args) {
        student x= new student();
        student y = new student();
        x.Strem ="ECE";
        y.Strem ="CSE";
        y.name = "Subhajit Ghosh";
        x.name ="SOUMEN LAHA";
        x.roll =83;
        y.roll =45;
        System.out.println(x.name);
        System.out.println(x.roll);
        System.out.println(x.Strem);
        System.out.println();
         System.out.println(y.name);
        System.out.println(y.roll);
        System.out.println(y.Strem);

    }
}
