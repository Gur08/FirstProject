package July4;

public class If_statement {
    public static void main(String[] args){
        int x=10;
        int y=20;
        if((x+y >=15) && (x+y>=19)) {
            System.out.println(x);
        }
        if((x-y >=15) && (x*y>=19)) {
            System.out.println("Hello");
        }
       if((x+y >=15) || (x*y>=19) && (x==10)) {
          System.out.println("Hello");
        }
    }
}
