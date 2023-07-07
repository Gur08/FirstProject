public class Variable {
    //declaration, int
    // data_type nameofvariable; - Syntax
    public static void main(String[] args) {
        int x; // declaration
        x=20; // initialization literals are number

        int y = 20;
        float z = 10.2f;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x + "   "+y); // to print in same line
        // + - concentation
        String name = "Gurpreet";
                System.out.println(name);
                System.out.println(z);
                long population = 125_487_95_54l;
                double salary = 2000.232;
                float bonus = 1225455.2f; // always type f at the end of float otherwise java is considering it as double by default
                char letter = 'A';
                boolean israining = true;

                System.out.println(population);
                System.out.println(salary);
                System.out.println(bonus);
                System.out.println(letter);
                System.out.println(israining);
    }
}
