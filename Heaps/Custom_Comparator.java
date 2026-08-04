import java.util.*;
class Student implements Comparable<Student>{
        int roll;
        String name;
        Double marks;
        Student(int roll,String name,Double marks){
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }
        public int compareTo(Student s){
            return (int)(this.marks-s.marks);
        }
}
 public class Custom_Comparator {
    public static void print(Student[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].name+" "+arr[i].roll+" "+arr[i].marks);

        }
    }
    public static void main(String[] args) {
        Student[] s = new Student[4];
        s[0] = new Student(83,"Soumen",89.9); 
        s[1] = new Student(81,"Sohom",80.6);
        s[2] = new Student(89,"Rahul",78.6);
        s[3] = new Student(90,"Arka",90.3);
        //Custom_Comparator obj = new Custom_Comparator();
        //print(s);
        Arrays.sort(s);
        print(s);
      
    }
}
