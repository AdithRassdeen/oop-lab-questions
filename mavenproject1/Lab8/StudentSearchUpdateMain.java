package Lab8;

public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        System.out.println("\nSearching for student ID 1:");
        dao.findStudentById(1);

        System.out.println("\nUpdating mark for student ID 1 to 95...");
        dao.updateStudentMark(1, 95);

        System.out.println("\nSearching for student ID 1 again:");
        dao.findStudentById(1);
    }
}