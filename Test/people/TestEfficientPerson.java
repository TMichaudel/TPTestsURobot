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
public class TestEfficientPerson extends TestIPerson{
    
    public TestEfficientPerson() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        iperson = new EfficientPerson("toto", "tutu", 25);
    }
    
    @After
    public void tearDown() {
    }

    // ERREURS:
        //- wasBorn() retourne vrai si la personne est née dans le future
        //- getAge(date) devrait retourner l'age à la date donnée, il retourne l'age d'aujourd'hui
        //- getAge(date) si date est avant la naissance, ne donne pas d'exception
        //- 
}
