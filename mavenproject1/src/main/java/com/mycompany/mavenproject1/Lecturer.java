package com.mycompany.mavenproject1;

public class Lecturer extends StaffMember {
    
    private int courseCount;
    private double paymentPerCourse;

    public Lecturer(String fullName, String staffid, String department, int courseCount, double paymentPerCourse) {
        
        super(fullName, staffid, department);
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }

    public void displayLecturerDetails() {
        
        displayBasicDetails();
        System.out.println("Course Count: " + courseCount);
        System.out.println("Payment Per Course: " + paymentPerCourse);
    }
}