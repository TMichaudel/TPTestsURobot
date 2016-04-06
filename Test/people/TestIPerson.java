/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persons.IPerson;
import persons.Person;
import persons.TestPerson;

/**
 *
 * @author mathieu
 */
public abstract class TestIPerson {
    protected IPerson iperson;
    //String nom;
    //String prenom;
    //int age;
    //GregorianCalendar dateNaiss;
    
    public TestIPerson() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //iperson = new EfficientPerson("toto", "tutu", 25);
    }
    
    @After
    public void tearDown() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestGetAgeFuture() {
        GregorianCalendar date0 = new GregorianCalendar(1985, 10, 12);
        iperson.getAge(date0);
    }

    @Test
    public void TestGetAge() {
        GregorianCalendar date0 = new GregorianCalendar(1995, 10, 12);
        assertEquals(iperson.getAge(date0), 5);
    }
    
    @Test
    public void TestWasBorn() {
        GregorianCalendar date0 = new GregorianCalendar(1985, 10, 12);
        GregorianCalendar date1 = new GregorianCalendar(1995, 10, 12);
        assertEquals(iperson.wasBorn(date0),false);
        assertEquals(iperson.wasBorn(date1),true);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
