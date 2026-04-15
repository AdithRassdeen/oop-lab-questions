package com.mycompany.mavenproject1; 

public class LabAssistant extends StaffMember {
    
    private int hoursWorked;
    private double hourlyRate;

    public LabAssistant(String fullName, String staffid, String department, int hoursWorked, double hourlyRate) {
        super(fullName, staffid, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }

    public void displayLabAssistantDetails() {
        displayBasicDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        /* The 'department' variable can be used directly in child classes
        because it is declared as 'protected' in the StaffMember parent class,
        which allows access within subclasses.*/
        
        System.out.println("Department (Accessed via protected): " + department);
    }
}