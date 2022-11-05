package edu.bsuir.junittraining;

import edu.bsuir.junittraining.developer.Developer;
import edu.bsuir.junittraining.developer.DeveloperLogic;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeveloperTests {

    Developer developer = new Developer();
    DeveloperLogic logic = new DeveloperLogic();

    @Before
    public void setUp(){
        developer.setFirsName("Simple");
        developer.setLastName("Developer");
        developer.setSpecialty("Java");
        developer.setSalary(2000_00);
    }

    @Test
    public void shouldCreateDeveloperInstanceTest(){
        assertEquals("Simple", developer.getFirsName());
        assertEquals("Developer", developer.getLastName());
        assertEquals("Specialty", developer.getSpecialty());
        assertEquals(2000_00, developer.getSalary());
    }

    @Test
    public void shouldCalculateAnnualSalaryTest(){
        assertEquals(24_000_00, logic.calculateAnnualSalary(developer));
    }

    @Test
    public void shouldCalculateHourRateTest(){
        assertEquals(1250, logic.calculateHourRate(developer));
    }
}



