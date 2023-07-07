package Assignment;

public class Swap_variable_without_3_variable {
    public static void main(String[] args){
        int x = 20;
        int y = 25;
        y = x;
        x +=5;
        System.out.println("X :"+ x);
        System.out.println("Y :"+y);
        int a = 5;
        int b = 10;
        b = (a * b)/(a=b);
        System.out.println("A :"+ a);
        System.out.println("B :"+b);

    }
}
