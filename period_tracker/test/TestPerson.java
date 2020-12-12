package tests;

import model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {

    Person person = new Person("Jennifer", 25, 56, 128, 37, "happy");

    @Test
  public void testPerson1() {
        assertEquals(person.getAge(), 25);
    }

    @Test
  public void testPerson2() {
        assertEquals(person.getBodytemperature(), 37);

    }

    @Test
  public void testPerson3() {
        assertEquals(person.getFeelings(),"happy");

    }

    @Test
  public void testPerson4() {
        assertEquals(person.getHeartrate(), 128);

    }

    @Test
  public void testPerson5() {
        assertEquals(person.getName(), "Jennifer");

    }

    @Test
  public void testPerson6() {
        assertEquals(person.getWeight(), 56);

    }
}
