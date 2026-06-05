package Lab8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    // Student record එකක් ඇතුළත් කිරීමට
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, student.getStudentId());
            stmt.setString(2, student.getStudentName());
            stmt.setInt(3, student.getMark());
            
            stmt.executeUpdate();
            System.out.println("Student added successfully.");
            
        } catch (SQLException e) {
            System.out.println("Database error (Add Student): " + e.getMessage());
        }
    }

    // සියලුම සිසුන් පෙන්වීමට
    public void displayAllStudents() {
        String sql = "SELECT student_id, student_name, mark FROM students";
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            System.out.println("\n--- Student List ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("student_id") + 
                                   " | Name: " + rs.getString("student_name") + 
                                   " | Mark: " + rs.getInt("mark"));
            }
            System.out.println("--------------------");
            
        } catch (SQLException e) {
            System.out.println("Database error (Display Students): " + e.getMessage());
        }
    }

    // ID එකෙන් ශිෂ්‍යයෙක් සෙවීමට
    public void findStudentById(int studentId) {
        String sql = "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, studentId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Found -> ID: " + rs.getInt("student_id") + 
                                       " | Name: " + rs.getString("student_name") + 
                                       " | Mark: " + rs.getInt("mark"));
                } else {
                    System.out.println("Student not found.");
                }
            }
            
        } catch (SQLException e) {
            System.out.println("Database error (Search Student): " + e.getMessage());
        }
    }

    // ලකුණු වෙනස් කිරීමට
    public void updateStudentMark(int studentId, int newMark) {
        String sql = "UPDATE students SET mark = ? WHERE student_id = ?";
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, newMark);
            stmt.setInt(2, studentId);
            
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student mark updated successfully.");
            } else {
                System.out.println("Student not found. Mark not updated.");
            }
            
        } catch (SQLException e) {
            System.out.println("Database error (Update Student): " + e.getMessage());
        }
    }
}