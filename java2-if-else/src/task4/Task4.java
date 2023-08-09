package task4;

import java.util.Scanner;

//Write a program that checks whether a number is positive or negative.
public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number  =  input.nextInt();

        if (number > 0) {
            System.out.println("The entered number is positive.");
        }else if (number == 0){
            System.out.println("The entered number is zero.");
        } else {
            System.out.println("The entered number is negative. ");
        }
        input.close();

    }
}
