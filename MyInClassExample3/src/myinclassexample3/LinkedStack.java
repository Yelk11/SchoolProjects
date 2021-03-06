/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinclassexample3;

/**
 *
 * @author Matthew
 */
public class LinkedStack<T> implements StackInterface<T>
{
    private Node firstItem;
    
    public LinkedStack()
    {
        firstItem = null;
    }
    @Override
    public T pop()
    {
        T item = peek();
        firstItem = firstItem.next;
        return item;
    }

    @Override
    public T peek()  throws Exeption
    {
        if(isEmpty())
        {
            throw new Exeption();
        }
        return firstItem.data;
    }

    @Override
    public void push(T item)
    {
        Node newNode = new Node(item, firstItem);
        
    }

    @Override
    public boolean isEmpty()
    {
        return firstItem == null;
    }

    @Override
    public void clear()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class Node
    {
        
        private T data;
        private Node next;
        
        Node(T data)
        {
            this(data, null);
        }
        Node( T data, Node next)
        {
            this.data = data;
            this.next = next;
        }
        
        
    }
    
    
 
    
}
