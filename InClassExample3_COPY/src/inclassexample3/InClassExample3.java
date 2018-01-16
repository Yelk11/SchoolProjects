/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassexample3;

import java.util.Stack;

/**
 *
 * @author etcharn1
 */
public class InClassExample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>();
        
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        
        while ( !myStack.empty() )
        {
            System.out.println(myStack.pop());
        }
    }
    
    public static void First()
    {
        Second(5);
    }
    
    public static void Second(int i)
    {
        Third( i % 5 );
    }
    
    public static void Third(int x)
    {
        System.out.print(10/x);
    }
}
