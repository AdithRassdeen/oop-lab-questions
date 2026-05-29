package Lab7;

public class ProductBillTest {
    public static void main(String[] args) {
        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            double total = bill.calculateTotal();
            System.out.println("Total Bill: " + total);
        } 
        catch (NumberFormatException e) {
            /* Part C: 
            This exception occurs because the String value "two" is passed to 
            Integer.parseInt(). This text does not contain parsable digits, 
            so it cannot be converted safely into an integer primitive.
             */
            System.out.println("Error: Price and quantity must be valid numbers.");
        } 
        finally {
            System.out.println("Product bill calculation completed.");
        }
        
        System.out.println("Program continues...");
    }
}

