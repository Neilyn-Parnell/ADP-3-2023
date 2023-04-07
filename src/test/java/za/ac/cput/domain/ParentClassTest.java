package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentClassTest {
@Test
    public void testParentBuilder() {
        ParentClass parent = new ParentClass.Builder()
                .parentId(1)
                .parentName("John Doe")
                .phoneNumber("+1 555-555-5555")
                .build();

        assertEquals(1, parent.getParentId());
        assertEquals("John Doe", parent.getParentName());
        assertEquals("+1 555-555-5555", parent.getPhoneNumber());
    }
}