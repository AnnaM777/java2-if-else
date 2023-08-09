package Task2;

import java.util.Scanner;

//Create the variables "username" and "password" and define some values as desired.
// The user enters two values through the scanner, which should represent username and password,
// and the program should compare them. If the username and password are correct,
// print "Successfully logged in", and if one of those two is wrong, print the same message "Wrong username or password".
public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a username: ");
        String username = input.nextLine();
        System.out.println("Enter a password: ");
        String password = input.nextLine();

        if (username.equals("anna") && password.equals("ddvvyy")) {
            System.out.println("Successfully logged in! ");
        }else {
            System.out.println("Wrong username or password! ");
        }
        input.close();

    }

}
