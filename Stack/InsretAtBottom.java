package Stack;
import java.util.Stack;
public class InsretAtBottom {
    public static void main(String[] args) {
        Stack <Integer> x = new Stack<>();
        Stack <Integer> y = new Stack<>();
        x.push(2);
        x.push(4);
        x.push(5);
        x.push(9);
        x.push(12);
        x.add(2,12);
        System.out.println(x);
        while(x.size()>1){
            y.push(x.pop());

        }
        x.push(15);
        while(y.size()>0){
            x.push(y.pop());
        }
        System.out.println(x);

       

    
    }
     
}
