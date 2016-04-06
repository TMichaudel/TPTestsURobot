/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persons;

import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import people.TestIPerson;

/**
 *
 * @author Thibaud
 */
public class TestPerson extends TestIPerson{


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
        iperson = new Person("toto", "tutu", 1990, 10, 12);
    }

    @After
    public void tearDown() {
    }

    
}
