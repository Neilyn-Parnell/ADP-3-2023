package za.ac.cput.domain;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class courseTest {
    @Test
    public void testCourse() {
        // Create a new Course object
        course course = new course();

        // Set the course name, course code, department, and enrolled students
        course.setCourseName("Introduction to Computer Science");
        course.setCourseCode("CS101");
        course.setDepartment("Computer Science");
        List<String> enrolledStudents = new ArrayList<>();
        enrolledStudents.add("Alice");
        enrolledStudents.add("Bob");
        course.setEnrolledStudents(enrolledStudents);

        // Check that the values were set correctly
        assertEquals("Introduction to Computer Science", course.getCourseName());
        assertEquals("CS101", course.getCourseCode());
        assertEquals("Computer Science", course.getDepartment());
        assertEquals(enrolledStudents, course.getEnrolledStudents());

        // Change the values of the course name, course code, department, and enrolled students
        course.setCourseName("Data Structures and Algorithms");
        course.setCourseCode("CS201");
        course.setDepartment("Computer Science and Engineering");
        List<String> newEnrolledStudents = new ArrayList<>();
        newEnrolledStudents.add("Charlie");
        newEnrolledStudents.add("David");
        course.setEnrolledStudents(newEnrolledStudents);

        // Check that the new values were set correctly
        assertEquals("Data Structures and Algorithms", course.getCourseName());
        assertEquals("CS201", course.getCourseCode());
        assertEquals("Computer Science and Engineering", course.getDepartment());
        assertEquals(newEnrolledStudents, course.getEnrolledStudents());
    }
}