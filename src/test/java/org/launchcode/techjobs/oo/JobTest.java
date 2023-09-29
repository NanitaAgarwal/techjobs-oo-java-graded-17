package org.launchcode.techjobs.oo;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertTrue;

public class JobTest {
    //TODO: Create your unit tests here

    @BeforeTest
    public void before(){

    }

    @Test
    public void emptyTest(){
        assertEquals(1,1);
    }

    @Test
    public void testSettingJobId(){
        Job job01 = new Job();
        Job job02 = new Job();
        assertNotEquals(job01.getId(),job02.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job03 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job03.getName(),"Product tester");
        assertEquals(job03.getEmployer().getValue(),"ACME");
        assertEquals(job03.getLocation().getValue(),"Desert");
        assertEquals(job03.getPositionType().getValue(),"Quality control");
        assertEquals(job03.getCoreCompetency().getValue(),"Persistence");
        assertTrue(job03.getEmployer().getClass()==Employer.class);
        assertTrue(job03.getLocation().getClass()==Location.class);
        assertTrue(job03.getPositionType().getClass()==PositionType.class);
        assertTrue(job03.getCoreCompetency().getClass()==CoreCompetency.class);
        assertTrue(job03.getName().getClass()==String.class);
        assertTrue(job03.getEmployer() instanceof Employer);
        assertTrue(job03.getLocation() instanceof Location);
        assertTrue(job03.getPositionType() instanceof PositionType);
        assertTrue(job03.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(job03.getName() instanceof String);
    }

    @Test
    public void testJobsForEquality(){
        Job job04 = new Job("Web Developer",new Employer("Launch Code"), new Location("St Louis"), new PositionType("Full Time"), new CoreCompetency("Java"));
        Job job05 = new Job("Web Developer",new Employer("Launch Code"), new Location("St Louis"), new PositionType("Full Time"), new CoreCompetency("Java"));
        assertEquals(job04.equals(job05),false);
    }

}
