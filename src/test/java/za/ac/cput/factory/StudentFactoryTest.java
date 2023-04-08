package za.ac.cput.factory;
/*StudentFactoryTest .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {
    @Test
    public void test() {
        Student student = StudentFactory.createStudent("Yongs", "987657t", "yonela@yahoo.com");
        assertNotNull(student);
        System.out.println(student.toString());

    }
}
