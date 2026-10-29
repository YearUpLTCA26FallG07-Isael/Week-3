package com.pluralsight;
import java.io.*;
import java.util.Scanner;
public class bedtimeStories {
    public static void main(String[]arg){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Book choices: goldilocks , hansel_and_gretel , mary_had_a_little_lamb");
        System.out.print("Enter the name of the file to load:");
        String option = newScanner.nextLine();
        fileReading(option);


    }
    public static void fileReading(String option){
        try{
            FileReader fileReader1 = new FileReader("goldilocks.txt");
            FileReader fileReader2 = new FileReader("hansel_and_gretel.txt");
            FileReader fileReader3 = new FileReader("mary_had_a_little_lamb.txt");
            BufferedReader buffReader1 = new BufferedReader(fileReader1);
            BufferedReader buffReader2 = new BufferedReader(fileReader2);
            BufferedReader buffReader3 = new BufferedReader(fileReader3);

            String input;
            int num = 1;
            if(option.equals("goldilocks")){
                while((input = buffReader1.readLine()) != null) {
                    System.out.println(num + ". " + input);
                    num++;
                }
            }
            else if(option.equals("hansel_and_gretel")){
                while((input = buffReader2.readLine()) != null) {
                    System.out.println(num + ". " + input);
                    num++;
                }
            }
            else if(option.equals("mary_had_a_little_lamb")){
                while((input = buffReader3.readLine()) != null) {
                    System.out.println(num + ". " + input);
                    num++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
