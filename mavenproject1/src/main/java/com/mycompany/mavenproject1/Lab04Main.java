package com.mycompany.mavenproject1;

public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();
        System.out.println("------------------------------------");
        
        Lecturer lec1 = new Lecturer("Dr. Perera", "L001", "Computing", 3, 50000.0);
        Lecturer lec2 = new Lecturer("Prof. Smith", "L002", "Business", 2, 60000.0);
        LabAssistant lab1 = new LabAssistant("Mr. Silva", "A505", "Engineering", 40, 1500.0);

        System.out.println("\n--- Lecturer 1 Details ---");
        lec1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec1.calculateMonthlyPayment());
        
        System.out.println("\n--- Lab Assistant Details ---");
        lab1.displayLabAssistantDetails();
        System.out.println("Monthly Payment: " + lab1.calculateMonthlyPayment());
        
        System.out.println("\n--- University Policy Information ---");
        UniversityPolicy.showPolicyHeader();
        System.out.println("University Name: " + UniversityPolicy.UNIVERSITY_NAME);
        
        System.out.println("\n------------------------------------");
        System.out.println("Total Staff Members Created: " + StaffMember.getStaffCount());
        
        double lecBonus = UniversityPolicy.calculateBonus(lec1.calculateMonthlyPayment());
        double labBonus = UniversityPolicy.calculateBonus(lab1.calculateMonthlyPayment());
        
        System.out.println("Lecturer Bonus Estimate: " + lecBonus);
        System.out.println("Lab Assistant Bonus Estimate: " + labBonus);
    }
}