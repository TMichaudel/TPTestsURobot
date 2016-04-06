/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persons;

import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Thibaud
 */
public class TestPerson {

    protected Person person;

    public TestPerson() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        person = new Person("toto", "tutu", 1990, 10, 12);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test(expected = IllegalArgumentException.class)
    public void TestGetAgeFuture() {
        GregorianCalendar date0 = new GregorianCalendar(1985, 10, 12);
        person.getAge(date0);
    }

    @Test
    public void TestGetAge() {
        GregorianCalendar date0 = new GregorianCalendar(1995, 10, 12);
        assertEquals(person.getAge(date0), 5);
    }
    
    @Test
    public void TestWasBorn() {
        GregorianCalendar date0 = new GregorianCalendar(1985, 10, 12);
        GregorianCalendar date1 = new GregorianCalendar(1995, 10, 12);
        assertEquals(person.wasBorn(date0),false);
        assertEquals(person.wasBorn(date1),true);
    }
}
