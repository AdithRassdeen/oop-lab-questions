package com.mycompany.mavenproject1;

public class Lab04Main {
    public static void main(String[] args) {
        
        Lecturer lec1 = new Lecturer("Dr. Perera", "L001", "Computing", 3, 50000.0);
        LabAssistant lab1 = new LabAssistant("Mr. Silva", "A505", "Engineering", 40, 1500.0);

        System.out.println("--- Lecturer Details ---");
        lec1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec1.calculateMonthlyPayment());
        
        System.out.println("\n--- Lab Assistant Details ---");
        lab1.displayLabAssistantDetails();
        System.out.println("Monthly Payment: " + lab1.calculateMonthlyPayment());
        
        System.out.println("\n--- University Policy Information ---");
        UniversityPolicy.showPolicyHeader();
        System.out.println("University Name: " + UniversityPolicy.UNIVERSITY_NAME);
        
        double lecBonus = UniversityPolicy.calculateBonus(lec1.calculateMonthlyPayment());
        double labBonus = UniversityPolicy.calculateBonus(lab1.calculateMonthlyPayment());
        
        System.out.println("Lecturer Bonus Estimate: " + lecBonus);
        System.out.println("Lab Assistant Bonus Estimate: " + labBonus);
    }
}