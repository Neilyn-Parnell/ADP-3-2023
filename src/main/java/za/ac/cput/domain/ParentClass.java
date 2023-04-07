package za.ac.cput.domain;

public class ParentClass {
    private int parent_id;
    private String parent_name;
    private String phone_number;

    public static class Builder {
        private int parent_id;
        private String parent_name;
        private String phone_number;

        public Builder parentId(int value) {
            parent_id = value;
            return this;
        }

        public Builder parentName(String value) {
            parent_name = value;
            return this;
        }

        public Builder phoneNumber(String value) {
            phone_number = value;
            return this;
        }

        public ParentClass build() {
            return new ParentClass(this);
        }
    }

    private ParentClass(Builder builder) {
        parent_id = builder.parent_id;
        parent_name = builder.parent_name;
        phone_number = builder.phone_number;
    }

    public int getParentId() {
        return parent_id;
    }

    public String getParentName() {
        return parent_name;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    // Example usage
    public static void main(String[] args) {
        ParentClass parent = new ParentClass.Builder()
                .parentId(1)
                .parentName("Enzokuhle")
                .phoneNumber("0719449412")
                .build();

        System.out.println("Parent ID: " + parent.getParentId());
        System.out.println("Parent Name: " + parent.getParentName());
        System.out.println("Phone Number: " + parent.getPhoneNumber());
    }
}
