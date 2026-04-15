package com.mycompany.mavenproject1;

public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();
        System.out.println("------------------------------------");
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
                
        Lecturer lec1 = new Lecturer("Dr. Perera", "L001", "Computing", 3, 50000.0);
        Lecturer lec2 = new Lecturer("Prof. Smith", "L002", "Business", 2, 60000.0);
        LabAssistant lab1 = new LabAssistant("Mr. Silva", "A505", "Engineering", 40, 1500.0);
        
        lec1.changeDepartment("Data Science");
        /*changeDepartment() is useful for controlled updates
          because it implements encapsulation, allowing the system to validate
          the new data (such as checking if the string is empty) before actually modifying the internal state of the object.*/

        System.out.println("\n--- Final Staff Summary ---");
        lec1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec1.calculateMonthlyPayment());
        
        System.out.println("\n---");
        lec2.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec2.calculateMonthlyPayment());
        
        System.out.println("\n--- Lab Assistant Details ---");
        lab1.displayLabAssistantDetails();
        System.out.println("Monthly Payment: " + lab1.calculateMonthlyPayment());
        
        double totalMonthly = lec1.calculateMonthlyPayment() + lec2.calculateMonthlyPayment() + lab1.calculateMonthlyPayment();
        System.out.println("\nTotal Monthly Payment for all staff: " + totalMonthly);
        
        System.out.println("Total Staff Objects Created: " + StaffMember.getStaffCount());
        
        System.out.println("\n--- Notices ---");
        lec1.showCommonNotice();
        lec2.showCommonNotice();
        lab1.showCommonNotice();
        
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