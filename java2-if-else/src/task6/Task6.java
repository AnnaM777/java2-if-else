package task6;

import java.util.Scanner;

//Make a program that displays text for years:
//under 18 - The person is 18 years of age or younger,
//From 19 to 39 - The person is between 19 and 39 years old,
//From 40 to 120 - A person is 40 years old or older,
//If it is over 120 - Too much maximum for the age!
//If a person enters below 0 - Negative years are not a valid entry!
public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some years: ");
        int years = input.nextInt();

        if (years <= 18 && years > 0){
            System.out.println("The person is 18 years of age or younger.");
        }else if (years >= 19 && years <= 39) {
            System.out.println("The person is between 19 and 39 years old.");
        } else if (years >= 40 && years <= 120){
            System.out.println("A person is 40 years old or older.");
        } else if (years > 120)
            System.out.println("Too much maximum for the age!");
        else if (years < 0) {
            System.out.println("Negative years are not a valid entry!");
        }
        input.close();
    }
}
