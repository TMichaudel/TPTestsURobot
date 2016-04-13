/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Outils;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import persons.IPerson;

/**
 *
 * @author Thibaud
 */
public class TestOutilsPerson {
    
    public TestOutilsPerson() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSearchOldestOk() {
        IPerson mockPerson0 = mock(IPerson.class);
        Mockito.when(mockPerson0.getAge(any(GregorianCalendar.class))).thenReturn(25);
        IPerson mockPerson1 = mock(IPerson.class);
        Mockito.when(mockPerson1.getAge(any(GregorianCalendar.class))).thenReturn(35);
        IPerson mockPerson2 = mock(IPerson.class);
        Mockito.when(mockPerson2.getAge(any(GregorianCalendar.class))).thenReturn(30);
        List<IPerson> lp = new ArrayList();
        lp.add(mockPerson0);
        lp.add(mockPerson1);
        lp.add(mockPerson2);
        int i = OutilsPerson.searchOldest(lp, null);
        assertEquals(i, 35);
    }
    
    @Test
    public void testSearchOldestEmpty() {
        List<IPerson> lp = new ArrayList();
        int i = OutilsPerson.searchOldest(lp, null);
        assertEquals(i, 0);
    }
    
    @Test
    public void testSearchOldestUnborn() {
        IPerson mockPerson0 = mock(IPerson.class);
        doThrow(new IllegalArgumentException()).when(mockPerson0).getAge(any(GregorianCalendar.class));
        List<IPerson> lp = new ArrayList();
        lp.add(mockPerson0);
        int i = OutilsPerson.searchOldest(lp, null);
        assertEquals(i, 0);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
