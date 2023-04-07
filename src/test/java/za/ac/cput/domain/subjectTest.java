package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class subjectTest {
    @Test
    public void testSubjectBuilder() {
        subject subject = new subject.Builder()
                .subjectCode("ADP360S")
                .subjectName("Applications Development")
                .build();

        assertEquals("ADP360S", subject.getSubjectCode());
        assertEquals("Applications Development", subject.getSubjectName());
    }
}