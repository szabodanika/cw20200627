package step1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Tests {

    private static Dealership dealership = new Dealership("Cool Cars", "Rick Sanchez");

    @Before
    public void before() {
        dealership = new Dealership("Cool Cars", "Rick Sanchez");
    }

    @Test
    public void addMake(){
        dealership.addMake("Test Make 1");
        dealership.addMake("Test Make 2");
        assertEquals(2, dealership.getMakes().size());

        dealership.addMake("Test Make 1");
        assertEquals(2, dealership.getMakes().size());
    }

    @Test
    public void removeMake(){
        dealership.addMake("Test Make 1");
        dealership.addMake("Test Make 2");
        assertEquals(2, dealership.getMakes().size());

        dealership.removeMake("Test Make 3");
        assertEquals(2, dealership.getMakes().size());

        dealership.removeMake("Test Make 1");
        assertEquals(1, dealership.getMakes().size());
    }

    @Test
    public void findMake(){
        dealership.addMake("Test Make 1");
        dealership.addMake("Test Make 2");

        assertEquals(2, dealership.getMakes().size());
        assertEquals(true, dealership.findMake("Test Make 1"));
        assertEquals(true, dealership.findMake("Test Make 2"));
        assertEquals(false, dealership.findMake("Test Make 3"));
    }
}
