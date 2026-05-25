
package Lab7;
public class StudentAverageCalculator {
    // Private attributes
    private int totalMarks;
    private int numberOfStudents;

    // Constructor to initialize values
    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    // Method to calculate average (returns int)
    public int calculateAverage() {
        // Do not handle the exception inside this class
        return totalMarks / numberOfStudents;
    }
}