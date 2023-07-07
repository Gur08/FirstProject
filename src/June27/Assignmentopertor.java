package June27;

public class Assignmentopertor {
    public static void main(String[] args){
        int x = 10; // intialization
        int y = 20;
        int temp; // declaration
        temp = x;
        x = y;
        y = temp;
        System.out.println("X :" +x);
        System.out.println("Y :"+ y);

        /*
        before : x =10 , y = 20;
        operation
        after y=10 , x =20
         */

    }
}
