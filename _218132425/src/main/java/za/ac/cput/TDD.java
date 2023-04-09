package za.ac.cput;

import java.util.Objects;

/*   TDD.java
     Author:Neilyn Parnell (218132425)
     Date: 07 April 2022
*/
public class TDD {
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TDD tdd = (TDD) o;
        return Objects.equals(test, tdd.test);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test);
    }

    @Override
    public String toString() {
        return "TDD{" +
                "test='" + test + '\'' +
                '}';
    }

}
