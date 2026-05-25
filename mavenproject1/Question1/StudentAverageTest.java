
package Lab7;

public class StudentAverageTest {
    public static void main(String[] args) {
        
        StudentAverageCalculator calculator = new StudentAverageCalculator(500, 0);

        try {
            
            int average = calculator.calculateAverage();
            System.out.println("Average Mark: " + average);
        } 
        catch (ArithmeticException e) {
            
            System.out.println("Error: Number of students cannot be zero.");
            
            // Part C: Short Comment explaining why the exception occurs
            // Comment: ArithmeticException occurs here because integer division by zero is mathematically undefined.
        } 
        finally {
            
            System.out.println("Average calculation completed.");
        }

      
        System.out.println("Program continues...");
    }
}

