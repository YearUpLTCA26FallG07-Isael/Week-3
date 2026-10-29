package com.pluralsight;
import java.util.InputMismatchException;
import java.util.Scanner;
public class famousQuotes {
    public static void main(String[]args){
        Scanner newScanner = new Scanner(System.in);
        String[] quotes = {
                "Believe in yourself.",
                "Stay hungry, stay foolish.",
                "Success is not final; failure is not fatal.",
                "Code is like humor. When you have to explain it, it's bad.",
                "The best way to predict the future is to create it.",
                "Do one thing every day that scares you.",
                "Dream big and dare to fail.",
                "Opportunities don't happen. You create them.",
                "Difficult roads often lead to beautiful destinations.",
                "Small steps every day lead to big results."
        };

        System.out.print("Enter a number between 1 and 10: ");
        boolean valid = false;
        while(!valid) {
            try {
                int input = newScanner.nextInt();
                System.out.println(quotes[input]);
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print("Wrong input. Enter a number between 1 and 10: ");
                newScanner.nextLine();
            }
        }





    }
}
