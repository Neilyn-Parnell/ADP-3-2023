package za.ac.cput.domain;

public class Subject {
    private String subject_code;
    private String subject_name;

    public static class Builder {
        private String subject_code;
        private String subject_name;

        public Builder subjectCode(String value) {
            subject_code = value;
            return this;
        }

        public Builder subjectName(String value) {
            subject_name = value;
            return this;
        }

        public Subject build() {
            return new Subject(this);
        }
    }

    private Subject(Builder builder) {
        subject_code = builder.subject_code;
        subject_name = builder.subject_name;
    }

    public String getSubjectCode() {
        return subject_code;
    }

    public String getSubjectName() {
        return subject_name;
    }

    public static void main(String[] args) {
        Subject subject = new Subject.Builder()
                .subjectCode("ADP360S")
                .subjectName("Applications Development")
                .build();

        System.out.println("Subject Code: " + subject.getSubjectCode());
        System.out.println("Subject Name: " + subject.getSubjectName());
    }
}
