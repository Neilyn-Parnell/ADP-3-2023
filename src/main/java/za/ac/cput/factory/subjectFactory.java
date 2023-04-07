package za.ac.cput.factory;

import za.ac.cput.domain.subject;

public class subjectFactory {
    public static subject createSubject(String subject_code, String subject_name) {
        return new subject.Builder()
                .subjectCode(subject_code)
                .subjectName(subject_name)
                .build();

    }
    subject subject = subjectFactory.createSubject("ADP360S", "Applications Development");
}
