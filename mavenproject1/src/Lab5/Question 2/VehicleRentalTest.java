package Lab5;

public class VehicleRentalTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("C-1234", "Toyota", 5, 4500.0);
        Vehicle vehicle2 = new Bike("B-9876", "Yamaha", 10, 500.0);

        // Polymorphism behavior
        System.out.println("--- Car Rental Details ---");
        vehicle1.displayVehicleInfo();
        System.out.println("Total Cost: " + vehicle1.calculateRentalCost());

        System.out.println("\n--- Bike Rental Details ---");
        vehicle2.displayVehicleInfo();
        System.out.println("Total Cost: " + vehicle2.calculateRentalCost());

        // Short Comment:
        // This is runtime polymorphism because Java determines which calculateRentalCost() 
        // method to execute at runtime based on the actual object type (Car or Bike).
    }
}