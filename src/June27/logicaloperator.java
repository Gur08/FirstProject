package June27;

public class logicaloperator {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println(x<y && x>z); // && logical And operator
        System.out.println(x<y && x<z);
        /*
        And ---> it's true when both the condition is true
        OR ----> if any condition is true it's true
        not ---> opposite of condition
         */
        System.out.println(x<y || x>z); // || logical OR operator
        System.out.println(x>y || x>z);
        // ! logical not operator
    }
}
