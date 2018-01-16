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
public class PlugBoardTest
{
    
    public PlugBoardTest()
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
    public void testTranslate()
    {
        System.out.println("translate");
        char c = 'A';
        PlugBoard instance = new PlugBoard();
        char expResult = 'G';
        char result = instance.translate(c);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testEncode()
    {
        System.out.println("encode");
        char c = ' ';
        PlugBoard instance = new PlugBoard();
        char expResult = ' ';
        char result = instance.encode(c);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
