package Lab7;
// Part B & C: Test Classes and Logic
public class StudentMarkReportTest {
    public static void main(String[] args) {
        
        String[] marksArray = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marksArray);

        // --- Part B: Test an Invalid Array Index ---
        try {
            int mark = report.getMarkAt(6);
            System.out.println("Mark: " + mark);
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            /* Part D: Add Short Comments
               This exception occurs because index 6 is requested, but the array 
               only has indices from 0 up to 3. Accessing an index higher than or 
               equal to the length triggers this exception.
             */
            System.out.println("Error: Selected mark position does not exist.");
        } 
        finally {
            System.out.println("Array access checking completed.");
        }


        // --- Part C: Test an Invalid Number Format ---
        try {
            
            int mark = report.getMarkAt(2);
            System.out.println("Mark: " + mark);
        } 
        catch (NumberFormatException e) {
            // Part D: Add Short Comments
            /*  This exception occurs because index 2 yields the string "absent". 
               When Integer.parseInt("absent") is evaluated, it errors out since 
               "absent" is alphanumeric text rather than numerical values.
             */
            System.out.println("Error: Selected mark is not a valid number.");
        } 
        finally {
            System.out.println("Number conversion checking completed.");
        }

        System.out.println("Report checking completed.");
    }
}
