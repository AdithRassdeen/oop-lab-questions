package com.mycompany.mavenproject1;

public final class UniversityPolicy {
    /* A final class should not be inherited
      because it prevents other classes from modifying
      or overriding its core logic, ensuring consistent behavior.*/

    public static final String UNIVERSITY_NAME = "Green University";
    public static final double BONUS_RATE = 0.1; 

    public static void showPolicyHeader() {
        System.out.println("--- University Payment Policy ---");
    }
    
    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}