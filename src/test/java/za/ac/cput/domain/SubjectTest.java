package za.ac.cput.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class SubjectTest {
    @Test
    void testGetSubjectCode() {
        Subject subject = new Subject.Builder()
                .subjectCode("ADP360S")
                .subjectName("Applications Development")
                .build();
        Assertions.assertEquals("ADP360S", subject.getSubjectCode());
    }

    @Test
    void testGetSubjectName() {
        Subject subject = new Subject.Builder()
                .subjectCode("ADP360S")
                .subjectName("Applications Development")
                .build();
        Assertions.assertEquals("Applications Development", subject.getSubjectName());
    }

}