/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hold_em_yall;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matthew
 */
public class CardTest
{
    
    public CardTest()
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
    public void testGetFace()
    {
        System.out.println("getFace");
        Suit f = new Suit();
        Card instance = new Card(1,f.get(2));
        int expResult = 1;
        int result = instance.getFace();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetSuit()
    {
        System.out.println("getSuit");
        Card instance = null;
        String expResult = "";
        String result = instance.getSuit();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSuit()
    {
        System.out.println("setSuit");
        String suit = "";
        Card instance = null;
        instance.setSuit(suit);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFace()
    {
        System.out.println("setFace");
        int face = 0;
        Card instance = null;
        instance.setFace(face);
        fail("The test case is a prototype.");
    }
    
}
