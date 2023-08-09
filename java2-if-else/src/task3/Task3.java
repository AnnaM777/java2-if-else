package task3;
//Write a program that determines whether the entered number is even.
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The entered number is even. ");
        }else {
            System.out.println("The entered number is odd. ");
        }
        input.close();
    }

}
