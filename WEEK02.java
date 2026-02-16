import java.util.*;

public class WEEK02{
    // using conditions 
    // if
    // if else
    // if else if else
    // switch cases

    public static void main(String[] args) {
        // if statement, take input and check wheather it is odd or not
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number to check");
        int number1 = in.nextInt();
        if (number1%2 !=0){
            System.out.println("Number is odd");
        }

        // if else statement
        System.out.println("Enter your number to check");
        int number2 = in.nextInt();
        if (number2%2 !=0){
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }
}