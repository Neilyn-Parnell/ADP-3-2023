package za.ac.cput.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParentClassTest {
    @Test
    public void testParentClassBuilder() {
        ParentClass parent = new ParentClass.Builder()
                .parentId(1)
                .parentName("Enzokuhle")
                .phoneNumber("0719449412")
                .build();

        assertEquals(1, parent.getParentId());
        assertEquals("Enzokuhle", parent.getParentName());
        assertEquals("0719449412", parent.getPhoneNumber());
    }
}