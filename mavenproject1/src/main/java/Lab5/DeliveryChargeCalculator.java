package Lab5;

public class DeliveryChargeCalculator {
    private final double distanceRate = 100.0;
    private final double weightRate = 50.0;
    private final double expressFee = 500.0;

    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }
    
    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * distanceRate);
    }
    
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * distanceRate) + (weightKg * weightRate);
    }

    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + expressFee;
        }
        return baseCharge;
    }
}
