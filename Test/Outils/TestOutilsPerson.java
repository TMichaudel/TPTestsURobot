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

    @Test
    public void testIntervalOK() {
        IPerson mockPersonTropJeune = mock(IPerson.class);
        Mockito.when(mockPersonTropJeune.getAge(new GregorianCalendar(1985, 10, 11))).thenReturn(25);
        IPerson mockPerson35 = mock(IPerson.class);
        Mockito.when(mockPerson35.getAge(new GregorianCalendar(1985, 10, 11))).thenReturn(35);
        IPerson mockPerson30 = mock(IPerson.class);
        Mockito.when(mockPerson30.getAge(new GregorianCalendar(1985, 10, 11))).thenReturn(30); 
        IPerson mockPersonTropVieille = mock(IPerson.class);
        Mockito.when(mockPersonTropVieille.getAge(new GregorianCalendar(1985, 10, 11))).thenReturn(50);
        List<IPerson> personnes = new ArrayList<>();
        personnes.add(mockPersonTropJeune);
        personnes.add(mockPerson35);
        personnes.add(mockPerson30);
        personnes.add(mockPersonTropVieille);
        List<IPerson> result = OutilsPerson.getPeopleInterval(personnes, new GregorianCalendar(1985, 10, 11), 30, 35);
        assertEquals(result.size(), 2);
        assertEquals(result.get(0).getAge(new GregorianCalendar(1985, 10, 11)), 35);
        assertEquals(result.get(1).getAge(new GregorianCalendar(1985, 10, 11)), 30);
    }
    
    @Test
    public void testIntervalListVide(){
        List<IPerson> personnes = new ArrayList<>();
        List<IPerson> result = OutilsPerson.getPeopleInterval(personnes, new GregorianCalendar(1985, 10, 11), 30, 35);
        assertEquals(result.size(), 0);
    }
    
    @Test
    public void testIntervalUnborn(){
        IPerson mockPersonPasNee = mock(IPerson.class);
        Mockito.doThrow(new IllegalArgumentException()).when(mockPersonPasNee).getAge(new GregorianCalendar(1985, 10, 11));
        IPerson mockPerson32 = mock(IPerson.class);
        Mockito.when(mockPerson32.getAge(new GregorianCalendar(1985, 10, 11))).thenReturn(32);
        List<IPerson> personnes = new ArrayList<>();
        personnes.add(mockPerson32);
        personnes.add(mockPersonPasNee);
        List<IPerson> result = OutilsPerson.getPeopleInterval(personnes, new GregorianCalendar(1985, 10, 11), 30, 35);
        assertEquals(result.size(), 1);
        assertEquals(result.get(0).getAge(new GregorianCalendar(1985, 10, 11)), 32);
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
