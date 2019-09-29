package org.basics.equals;

import org.basics.entites.Person;
import org.basics.entites.Student;
import org.junit.Before;
import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class EqualsTest {

    public int numberOfInscription ;

    @Before
    public void setUp() {
        numberOfInscription = 0;
    }

    @Test
    public void should_return_false_when_objects_not_ovveride_equals() {

         final Person givenPersonA = new Person("mohammed", "tanouti");
         final Person givenPersonB = new Person("mohammed", "tanouti");

         System.out.println(givenPersonA + " adresse de B" + givenPersonB);

         assertFalse(givenPersonA.equals(givenPersonB));
    }

    @Test
    public void should_return_2_when_size_is_called() {

        Map<Person, Integer> givenMAp = new HashMap();
        final Person givenPersonA = new Person("mohammed", "tanouti");
        final Person givenPersonB = new Person("mohammed", "tanouti");

        givenMAp.put(givenPersonA, numberOfInscription +1);
        givenMAp.put(givenPersonB, numberOfInscription +1);

        assertEquals(givenMAp.size(), 2);
    }

    @Test
    public void should_return_true_when_tow_String_content_are_equals() {

        final String stringA = new String("mohammed");
        final String stringB = new String("mohammed");

        System.out.println(stringA == stringB);

        assertTrue(stringA.equals(stringB));
    }

    @Test
    public void should_return_true_when_studen_ovveride_equals() {

        final Student givenStudentA = new Student("mohammed", "tanouti");
        final Student givenStudentB = new Student("mohammed", "tanouti");

        System.out.println(givenStudentA + " adresse de B" + givenStudentB);

        assertTrue(givenStudentA.equals(givenStudentB));
    }
    @Test
    public void should_return_1_when_size_is_called() {

        Map<Student, Integer> givenMAp = new HashMap();
        final Student givenStudentA = new Student("mohammed", "tanouti");
        final Student givenStudentB = new Student("mohammed", "tanouti");

        System.out.println(givenStudentA.hashCode() + "  != " + givenStudentB.hashCode());
        System.out.println(givenStudentA.equals(givenStudentB));
        givenMAp.put(givenStudentA, numberOfInscription +1);
        givenMAp.put(givenStudentB, numberOfInscription +1);

        assertEquals(givenMAp.size(), 1);
    }

}
