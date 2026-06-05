package Lab8;

public class StudentDisplayMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        
        // ලැබ් ශීට් එකට අනුව තවත් records දෙකක් ඇතුළත් කිරීම
        dao.addStudent(new Student(2, "Kamal Silva", 74));
        dao.addStudent(new Student(3, "Sunethra Fernando", 91));
        
        // සියලුම ශිෂ්‍ය ලැයිස්තුව print කිරීම
        dao.displayAllStudents();
    }
}