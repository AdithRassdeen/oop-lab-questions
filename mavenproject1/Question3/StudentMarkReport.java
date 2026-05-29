package Lab7;
// Part A: Create the Mark Report Class
public class StudentMarkReport {
  
    private String[] marks;

    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    public int getMarkAt(int index) {
        String selectedMarkText = marks[index];
        return Integer.parseInt(selectedMarkText);
    }
}
