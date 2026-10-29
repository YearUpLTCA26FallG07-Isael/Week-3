package com.pluralsight;

public class employees {
    // Private data members (attributes)
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    // Parameterized constructor
    public employees(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for hoursWorked
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Getter and Setter for payRate
    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    // Calculate and return gross pay
    public double getGrossPay() {
        return hoursWorked * payRate;
    }
}

