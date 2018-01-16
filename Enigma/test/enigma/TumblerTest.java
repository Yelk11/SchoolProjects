/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class TumblerTest
{
    
    public TumblerTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    @Test
    public void testShiftChar()
    {
        System.out.println("shiftChar");
        char c = 'A';
        int shift = 5;
        char expResult = 'F';
        Tumbler instance = new Tumbler(shift);
        char result = instance.shiftChar(c);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testTranslate()
    {
        System.out.println("translate");
        Tumbler instance = new Tumbler(10);
        char expResult = 'F';
        char result = instance.translate('A');
        assertEquals(expResult, result);
        
    }
    
}
