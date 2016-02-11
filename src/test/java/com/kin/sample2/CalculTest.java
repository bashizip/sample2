/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kin.sample2;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Patrick Bashizi <bashizip@gmail.com>
 */
public class CalculTest extends TestCase {
   
    
    Calcul instance ;
    
    
    public CalculTest() {
    }
    
    @Before
    @Override
    public void setUp() {      
        instance= new Calcul();
    }
    
    @After
    @Override
    public void tearDown() {
        instance=null;
    }

    /**
     * Test of somme method, of class Calcul.
     */
    @Test
    public void testSomme() {
        
        System.out.println("somme");
        int a = 45;
        int b = 5;
 
        int expResult = 50;
        
        int result = instance.somme(a, b);
        
        if (a < 0 || b < 0) {
            fail("les valeurs doivent etre positives");
        }
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testRacineCaree() {        
        System.out.println("Test Racine Carée");
        double a = 25.0;    
        double expResult = 5.0;
        double result = instance.racineCaree(a);
        assertEquals(expResult, result);
    }
    
    
    
    
}
