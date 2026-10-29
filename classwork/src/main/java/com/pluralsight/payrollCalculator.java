package com.pluralsight;
import java.util.Scanner;
import java.io.*;
public class payrollCalculator {
    public static void main(String[]args) throws IOException {
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter the file to process:");
        String input = newScanner.nextLine();


        FileReader file = new FileReader(input);
        BufferedReader br = new BufferedReader(file);


        System.out.print("Enter the name of the payroll file to create: ");
        input = newScanner.nextLine();


        FileWriter fileWriter = new FileWriter(input);
        BufferedWriter buffWrite = new BufferedWriter(fileWriter);

        orginize(br , buffWrite);

        buffWrite.close();
        br.close();
    }



    public static void orginize(BufferedReader br , BufferedWriter buffWrite) throws IOException {

        String start = br.readLine();

        buffWrite.write(start);
        buffWrite.newLine();

        for (int i = 0; i < 8; i++) {

            String line = br.readLine();

            String[] data = line.split("\\|");

            int employeeId = Integer.parseInt(data[0]);

            String name = data[1];

            double hoursWorked = Double.parseDouble(data[2]);

            double payRate = Double.parseDouble(data[3]);

            employees emp = new employees(employeeId, name, hoursWorked, payRate);

            buffWrite.write(emp.getEmployeeId() + " , " + emp.getName() + " , " + emp.getGrossPay() + "\n");
            buffWrite.newLine();
        }




    }
  }


