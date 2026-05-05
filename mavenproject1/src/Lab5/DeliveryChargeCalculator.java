package Lab1;

public class DeliveryChargeCalculator {
    
    private final double DISTANCE_CHARGE = 100.0;
    private final double WEIGHT_CHARGE = 50.0;
    private final double EXPRESS_DELIVERY_CHARGE = 500.0;
    
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_CHARGE);
    }

    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * DISTANCE_CHARGE) + (weightKg * WEIGHT_CHARGE);
    }

    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + EXPRESS_DELIVERY_CHARGE;
        } else {
            return baseCharge;
        }
    }
}