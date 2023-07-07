package July4;

public class Largest_of_3_number {
    public static void main(String[] args){
        // take 3 number, print the largest one
        int x=25;
        int y=14;
        int z=16;
        if((x>y) && (x>z)){
            System.out.println(x);
        }
        else if((y>x) && (y>z)) {
            System.out.println(y);
        }
        else {
            System.out.println(z);
        }
    }
}
