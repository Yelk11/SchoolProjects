/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkeddeque;

/**
 *
 * @author Matthew
 */
public class MyLinkedDeque
{

    /**
     * @param args the command line arguments
     */
            private Node first;
    private Node last;
    
    
    private class Node<T>
    {
        public T data;
        public Node Previous;
        public Node next;
        
        public LinkedDeque()
    {
        first = null;
        last = null;
    }
    
    
    public void addToFront(T item)
    {
        Node newItem = new Node(null, item, first)
        if( first == null)
        {
            last = newNode;
        }else{
            
            first.previous = null;
        }
        first = newNode;
    
    }
    
    public void addToBack(T item)
    {
        
    }
    
    public T getFront()
    {
        if(first == null)
        {
            return null;
        }else{
            return first.data;
        }
    }
    
    public T getBack(){
        if(first == null)
        {
            return null;
        }else{
            return last.data;
        }
    }
    }
        
        public void Node(Node previous, T data, Node next)
        {
            this.Previous = previous;
            this.data = data;
            this.next = next;
        }

    
    
}
