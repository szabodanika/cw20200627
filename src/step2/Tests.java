package step2;

import org.junit.Before;
import org.junit.Test;
import step2.Dealership;

import static org.junit.Assert.*;

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

    @Test
    public void addCar(){
        dealership.addMake("Test Make 1");
        dealership.addMake("Test Make 2");

        dealership.addCar(new Car("Test Make 1", "1", "Model 1", "Black"));
        dealership.addCar(new Car("Test Make 2", "2", "Model 2", "Black"));

        assertEquals(2, dealership.getMakes().size());
    }

    @Test
    public void removeCar(){
        dealership.addMake("Test Make 1");
        dealership.addMake("Test Make 2");
        Car testCar1 = new Car("Test Make 1", "1", "Model 1", "Black");
        Car testCar2 = new Car("Test Make 2", "2", "Model 2", "Black");
        dealership.addCar(testCar1);
        dealership.addCar(testCar2);
        assertEquals(2, dealership.getCars().size());

        dealership.removeCar(testCar1);
        assertEquals(1, dealership.getCars().size());

        dealership.removeCar(testCar1);
        assertEquals(1, dealership.getCars().size());

        dealership.removeCar(testCar2);
        assertEquals(0, dealership.getCars().size());
    }

    @Test
    public void findCar(){
        dealership.addMake("Test Make 1");
        dealership.addMake("Test Make 2");
        Car testCar1 = new Car("Test Make 1", "1", "Model 1", "Black");
        Car testCar2 = new Car("Test Make 2", "2", "Model 2", "Black");
        dealership.addCar(testCar1);
        dealership.addCar(testCar2);
        assertEquals(2, dealership.getMakes().size());


        assertNotNull( dealership.findCarByReg("1"));
        assertNotNull( dealership.findCarByReg("2"));
        assertNull( dealership.findCarByReg("3"));
    }
}
