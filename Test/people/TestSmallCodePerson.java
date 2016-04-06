/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathieu
 */
public class TestSmallCodePerson extends TestIPerson{
    
    public TestSmallCodePerson() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        iperson = new SmallCodePerson("toto", "tutu", 1990, 10, 12);
    }
    
    @After
    public void tearDown() {
    }

    // ERREUR : probleme sur le calcul de l'age (né un ans après)
}
