package task5;

import java.util.Scanner;

//Create a program for the following task:
//If the entered  text is "regular baggage" - show that the weight limit is up to 20 kg.
//If the text "hand luggage" is entered - show that the allowed amount is up to 8 kg.
//     Otherwise, show that the entry is invalid.
public class Task5 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a text regular baggage or hand luggage: ");
        String text = input.nextLine();

        if (text.equals("regular baggage")){
            System.out.println("The weight limit is up to 20 kg.");
        } else if (text.equals("hand luggage")){
            System.out.println("The allowed amount is up to 8 kg.");
        }
        else {
            System.out.println("Invalid entry, try again!");
        }
        input.close();

    }
}
