package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class subjectTest {

    @Test
    public void testSubject() {
        // Create a new Subject object
        subject subject = new subject();

        // Set the subject code and name
        subject.setSubjectCode("ADP305");
        subject.setSubjectName("Applications Development");

        // Check that the values were set correctly
        assertEquals("ADP305", subject.getSubjectCode());
        assertEquals("Applications Development", subject.getSubjectName());

        // Change the values of the subject code and name
        subject.setSubjectCode("CS201");
        subject.setSubjectName("Data Structures and Algorithms");

        // Check that the new values were set correctly
        assertEquals("CS201", subject.getSubjectCode());
        assertEquals("Data Structures and Algorithms", subject.getSubjectName());
    }
}