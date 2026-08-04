package Stack;

import java.util.Stack;

public class DisplayStack {
    public static void DisplayREV(Stack<Integer> x){
        if(x.size()==0) return;
        int top = x.pop();
        System.out.print(top+" ");
         DisplayREV(x);
        x.push(top);

    }
    public static void Display(Stack<Integer> x){
        if(x.size()==0) return;
        int top = x.pop();
         Display(x);
         System.out.print(top+" ");
        x.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> x = new Stack<>();
         Stack<Integer> y = new Stack<>();
        x.push(1);
        x.push(5);
        x.push(10);
        x.push(12);
        x.push(15);
        x.push(20);
        x.push(25);  
        
        DisplayREV(x);
        System.out.println();
        Display(x);
       
        //  while(x.size()>0){
        //     y.push(x.pop());
        //  }
        //  while(y.size()>0){
        //      int idx = y.pop();
        //     System.out.print(idx+" ");
        //     x.push(idx);
        //  }
        //  System.out.println(x);

         
    }
    
}
