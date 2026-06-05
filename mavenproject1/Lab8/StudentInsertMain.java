package Lab8;

public class StudentInsertMain {
    public static void main(String[] args) {
        // ශිෂ්‍යයෙක් නිර්මාණය කිරීම (ID: 1, Name: Nimal Perera, Mark: 82)
        Student student = new Student(1, "Nimal Perera", 82);
        
        // DAO Class එක හරහා insert කිරීම
        StudentDAO dao = new StudentDAO();
        dao.addStudent(student);
    }
}