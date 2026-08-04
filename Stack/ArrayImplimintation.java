package Stack;
class Stack{
    int pop;
    int push;
    int peek;
    int isEmpty;
}
public class ArrayImplimintation {
     public static class Stack {
        int[] arr = new int[5];
        int idx =0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack Size is Full ");
                return;
            }
            arr[idx]=x;
            idx++;

        }
        int peek(int x){
            if(idx==0){
                System.out.println("Stack is Empty ");
                return -1;
                 
            }
            return arr[idx-1];
        }
        int pop(){
             if(idx==0){
                System.out.println("Stack is Empty ");
                return -1;
            }
            int top = arr[idx-1];
            top=0;
            idx--;
            return top;

        }
        void Display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(size()==0) return true;;
             return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
        int capacity(){
            return arr.length;
        }
        
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(4);
        st.Display();
        System.out.println(st.size());
        st.pop();
        st.Display();
        st.push(5);
        st.push(6);
        st.push(7);
        st.Display();
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(23);
        
        
    }
    
}
