package za.ac.cput.factory;

import za.ac.cput.domain.ParentClass;

public class ParentFactory {
    public static ParentClass createParent(int parent_id, String parent_name, String phone_number) {
        return new ParentClass.Builder()
                .parentId(parent_id)
                .parentName(parent_name)
                .phoneNumber(phone_number)
                .build();
    }
    ParentClass parent = ParentFactory.createParent(1, "John Doe", "+1 555-555-5555");
}
