package July4;

public class reason_why_else_if_used {
    public static void main(String[] args){
        // license exam, eligible to vote
        // age less  years -- take learner exam 18
        // 18 you are eligible to drive
        // if less than 16, you can not drive
        int age = 10;
        if(age<16){
            System.out.println("Not eligible to drive");
        }
        if(age>=16 && age<18){
            System.out.println("Learner Exam");
        }
        if(age>=18){
            System.out.println("drive wherever you want to...");
        }

        // problem with the above if statement is checking all the condition even though we got the result in first statement
        // it is not efficient program to replace with if else
        if(age<16){
            System.out.println("Not eligible to drive");
        }
        else if(age>=16 && age<18){
            System.out.println("Learner Exam");
        }
        else if(age>=18){
            System.out.println("drive wherever you want to...");
        }
        else {
            System.out.println("Invalid output");
        }
    }
}
