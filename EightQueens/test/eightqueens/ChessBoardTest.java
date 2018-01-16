/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightqueens;

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
public class ChessBoardTest
{
    
    public ChessBoardTest()
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
    public void testSet()
    {
        System.out.println("set");
        Queen q = null;
        int x = 0;
        int y = 0;
        ChessBoard instance = new ChessBoard();
        instance.set(q, x, y);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsEmpty_int_int()
    {
        System.out.println("isEmpty");
        int x = 0;
        int y = 0;
        ChessBoard instance = new ChessBoard();
        boolean expResult = false;
        boolean result = instance.isEmpty(x, y);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsEmpty_0args()
    {
        System.out.println("isEmpty");
        ChessBoard instance = new ChessBoard();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testReset_0args()
    {
        System.out.println("reset");
        ChessBoard instance = new ChessBoard();
        instance.reset();
        fail("The test case is a prototype.");
    }

    @Test
    public void testReset_int()
    {
        System.out.println("reset");
        int newX = 0;
        ChessBoard instance = new ChessBoard();
        instance.reset(newX);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUp()
    {
        System.out.println("up");
        ChessBoard instance = new ChessBoard();
        instance.up();
        fail("The test case is a prototype.");
    }

    @Test
    public void testDown()
    {
        System.out.println("down");
        ChessBoard instance = new ChessBoard();
        instance.down();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRight()
    {
        System.out.println("right");
        ChessBoard instance = new ChessBoard();
        instance.right();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLeft()
    {
        System.out.println("left");
        ChessBoard instance = new ChessBoard();
        instance.left();
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddQueen_0args()
    {
        System.out.println("addQueen");
        ChessBoard instance = new ChessBoard();
        instance.addQueen();
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddQueen_int_int()
    {
        System.out.println("addQueen");
        int x = 0;
        int y = 0;
        ChessBoard instance = new ChessBoard();
        instance.addQueen(x, y);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemoveQueen_0args()
    {
        System.out.println("removeQueen");
        ChessBoard instance = new ChessBoard();
        instance.removeQueen();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemoveQueen_int_int()
    {
        System.out.println("removeQueen");
        int x = 0;
        int y = 0;
        ChessBoard instance = new ChessBoard();
        instance.removeQueen(x, y);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCurrX()
    {
        System.out.println("getCurrX");
        ChessBoard instance = new ChessBoard();
        int expResult = 0;
        int result = instance.getCurrX();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetCurrY()
    {
        System.out.println("getCurrY");
        ChessBoard instance = new ChessBoard();
        int expResult = 0;
        int result = instance.getCurrY();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInDanger()
    {
        System.out.println("inDanger");
        int x = 0;
        int y = 0;
        ChessBoard instance = new ChessBoard();
        instance.addQueen(x, y);
        boolean expResult = true;
        boolean result = instance.inDanger(x, y);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetPosition()
    {
        System.out.println("setPosition");
        int x = 0;
        int y = 0;
        ChessBoard instance = new ChessBoard();
        instance.setPosition(x, y);
        int expResult = 0;
        int result = instance.getCurrX();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testCheckCorners()
    {
        System.out.println("checkCorners");
        int x = 2;
        int y = 0;
        int x1 = 1;
        int y1 = 1;
        //int x2 = 5;
        //int y2 = 5;
        ChessBoard instance = new ChessBoard();
        instance.addQueen(x, y);
        //instance.addQueen(x1, y1);
        //instance.addQueen(x2, y2);
        
        boolean expResult = true;
        boolean result = instance.checkCorners(x1, y1);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testToString()
    {
        System.out.println("toString");
        ChessBoard instance = new ChessBoard();
        String expResult = "0000000\n" +
        "0000000\n" +
        "0000000\n" +
        "0000000\n" +
        "0000000\n" +
        "0000000\n" +
        "0000000";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
