package com.mycompany.mavenproject1;

public class Lab04Main {
    public static void main(String[] args) {
        
        Lecturer lec1 = new Lecturer("Dr. Perera", "L001", "Computing", 3, 50000.0);

        System.out.println("--- Lecturer Details ---");
        lec1.displayLecturerDetails();

        System.out.println("Monthly Payment: " + lec1.calculateMonthlyPayment());
    }
}