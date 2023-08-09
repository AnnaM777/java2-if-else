package Task1;

import java.util.Scanner;

//Enter the year through the scanner, the program should calculate whether the year is a leap year.
public class Task1 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("Enter an year: ");
        int year = input.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is a leap year!");
        else
            System.out.println("Specified year is not a leap year! ");
    }
}
