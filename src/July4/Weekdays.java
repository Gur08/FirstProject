package July4;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in); // created object of scanner class
        System.out.println("Enter the Number");
        x = scanner.nextInt();
        if(x==1){
            System.out.println("It's Monday");
        }
        else if(x==2){
            System.out.println("It's Tuesday");
        }
        else if(x==3){
            System.out.println("It's Wednesday");
        }
        else if(x==4){
            System.out.println("It's Thursday");
        }
        else if(x==5){
            System.out.println("It's Friday");
        }
        else if(x==6){
            System.out.println("It's Saturday");
        }
        else if(x==7){
            System.out.println("It's Sunday");
        }
        else {
            System.err.println("Invalid Input");//System.err.println(""), err to print error messages
        }
    }
}
