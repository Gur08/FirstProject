package July4;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args){
        int x;
        Scanner scanner = new Scanner(System.in); // created object of scanner class
        System.out.println("Enter the value");
        x = scanner.nextInt();// .next int bc we want to take integer input from user
        System.out.println("Value of X : "+x);
    }
}
