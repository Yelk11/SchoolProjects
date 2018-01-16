/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author Matthew
 */
public class LinkedList<T> implements ListInterface<T>
{
    
    private Node first;
    private Node last;
    private Node current;
    private int numberOfEntries;
    
    LinkedList()
    {
        first = null;
        last = null;
        numberOfEntries = 0;
    }
    @Override
    public void add(T newEntry)
    {
        add(numberOfEntries, newEntry);
    }

    @Override
    public void add(int newPosition, T newEntry)
    {
        Node current;
        
    }

    @Override
    public T remove(int givenPosition)
    {
        if(isValidPosition(givenPosition))
        {
            Node<T> current = walkToNode(givenPosition);
            T item = current.data;
            
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
    }

    @Override
    public void clear()
    {
        first = null;
        last = null;
        numberOfEntries = 0;
    }

    @Override
    public T replace(int givenPosition, T newEntry)
    {
        if ( isValidPosition(givenPosition))
        {
            Node<T> current = walkToNode(givenPostion);
            T item = current.data;
            current.data = newEntry;
            return item;
        }
        return null;
    }

    @Override
    public T getEntry(int givenPosition)
    {
        if ( isValidPosition(givenPosition))
        {
            Node<T> current = walkToNode(givenPostion);
            T item = current.data;
            return current.data;
            
        }
        return null;
    }

    @Override
    public boolean contains(T anEntry)
    {
        Node current = first;
        while( current != null)
        {
            if(current.data.equals(anEntry))
            {
                return true;
            }
            current = current.next;
        }
        return false;

    }

    @Override
    public int getLength()
    {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty()
    {
        return numberOfEntries == 0;
    }
    
    public boolean isValidPosition(int position)
    {
        return walkToNode(position) == null;
    }
    
    public Node walkToNode(int position)
    {
        if ( isValidPosition(position))
        {
            if( position < numberOfEntries / 2 )
            {
                current = first;
                while(current < position)
                {
                    current = current.next;
                    currentPostion++;
                }
            }else{
                current = first;
                while(position < currenPosition)
                {
                    current = current.previous;
                    currentPostion--;
                }
            }
            
            Node newNode = new Node(current.previous, newEntry, current);
            
        }
        return newNode;
    }
    
    private class Node
    {
        Node next;
        Node previous;
        T data;
        Node(Node next, T data, Node previous)
        {
            this.next = next;
            this.previous = previous;
            this.data = data;
        }
    }
}
