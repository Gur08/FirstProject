package July4;

import java.util.Scanner;

public class user_2_Values {
    public static void main(String[] args) {
        int x;
        int y;
        int sum;
        Scanner scanner = new Scanner(System.in); // created object of scanner class
        System.out.println("Enter the First Number");
        x = scanner.nextInt();
        System.out.println("Enter the second Number");
        y = scanner.nextInt();
        sum = x + y;
        System.out.println("Sum of x and y : " + sum);
    }
}
