package Lab5; //

public class DeliveryChargeTest {
    public static void main(String[] args) {
        // Create an object of the calculator
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        // Testing each overloaded method
        System.out.println("--- Delivery Charge Estimates ---");
        
        System.out.println("Base Only: " + calculator.calculateCharge(300.0));
        System.out.println("With Distance (5km): " + calculator.calculateCharge(300.0, 5.0));
        System.out.println("With Weight (5km, 2kg): " + calculator.calculateCharge(300.0, 5.0, 2.0));
    }
} 
        // Short Comment explaining the concept:
        // This is compile-time polymorphism because the Java compiler determines 
        // which version of the calculateCharge method to call at compile time 
        // based on the method signature (the number and types of parameters provided).
