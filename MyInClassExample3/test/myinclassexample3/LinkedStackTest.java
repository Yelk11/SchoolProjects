/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinclassexample3;

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
public class LinkedStackTest
{
    
    public LinkedStackTest()
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
    public void testPop()
    {
        System.out.println("pop");
        LinkedStack instance = new LinkedStack();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPeek()
    {
        System.out.println("peek");
        
        Integer item = 42;
        LinkedStack instance = new LinkedStack();
        instance.push(item);
        assertEquals(instance.pop(), 42);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPush()
    {
        System.out.println("push");
        Integer item = 42;
        LinkedStack instance = new LinkedStack();
        instance.push(item);
        assertEquals(instance.isEmpty(), true);
    }

    @Test
    public void testIsEmpty()
    {
        System.out.println("isEmpty");
        LinkedStack instance = new LinkedStack();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testClear()
    {
        System.out.println("clear");
        LinkedStack instance = new LinkedStack();
        instance.clear();
        fail("The test case is a prototype.");
    }
    
}
