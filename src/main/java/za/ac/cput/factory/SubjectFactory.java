package za.ac.cput.factory;

import za.ac.cput.domain.Subject;

public class SubjectFactory {
    public static Subject createSubject(String subject_code, String subject_name) {
        return new Subject.Builder()
                .subjectCode(subject_code)
                .subjectName(subject_name)
                .build();

    }
    Subject subject = SubjectFactory.createSubject("ADP360S", "Applications Development");
}
