package StringBuilders;

public class immutability {
    public static void main(String[] args) {
        String s ="Physics Wallah Skills";
        String str ="";
        int n =s.length();
        for(int i=0;i<n;i++){
            if(i%2!=0){
            str+="a";
            }else{
                str+=s.charAt(i);
            }
        }
         s= str;
        System.out.println(s);
    }
}
