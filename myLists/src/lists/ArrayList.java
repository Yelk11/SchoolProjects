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
public class ArrayList<T> implements ListInterface<T>
{

    private T[] list;
    private int numberOfEntries;
    
    ArrayList()
    {
        this(10);
    }
    
    ArrayList(int capacity)
    {
        list = (T[]) new Object[capacity];
        numberOfEntries = 0;
    }
    
    
    
    @Override
    public void add(T newEntry)
    {
        add( numberOfEntries, newEntry);
    }

    @Override
    public void add(int newPosition, T newEntry)
    {
        ensureCapacity();
        
        for(int index = numberOfEntries; index >= numberOfEntries; index--)
        {
            list[index] = list[index - 1];
        }
        list[newPosition] = newEntry;
    }

    @Override
    public T remove(int givenPosition)
    {
        if( isValidPosition(givenPosition))
        {
            T item = list[givenPosition];
            for (int index = givenPosition; index < numberOfEntries - 1; index--)
            {
                list[index] = list[index + 1];
                
            }
            numberOfEntries--;
            list[numberOfEntries] = null;
            
        }
        return null;
    }

    @Override
    public void clear()
    {
        list = (T[]) new Object[10];
    }

    @Override
    public T replace(int givenPosition, T newEntry)
    {
        if (isValidPosition(givenPosition))
        {
            T item = list[givenPosition];
            list[givenPosition] = newEntry;
            return list[givenPosition];
        }else{
            return null;
        }
    }

    @Override
    public T getEntry(int givenPosition)
    {
        if ( isValidPosition(givenPosition))
        {
            return list[givenPosition];
        }else{
            return null;
        }
    }

    @Override
    public boolean contains(T anEntry)
    {
        for ( int index  = 0; index< numberOfEntries; index++)
        {
            if( anEntry.equals( list[index]))
            {
                return true;
            }
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
    
    private void ensureCapacity()
    {
        if( numberOfEntries == list.length )
        {
            T[] temp = (T[]) new Object[ list.length * 2 ];
            
            for(int index = 0; index < list.length; index++)
            {
                temp[index] = list[index];
            }
            list = temp;
        }
    }
    
    private boolean isValidPosition( int givenPosition)
    {
        return givenPosition >= 0 && givenPosition < numberOfEntries;
    }
    
}
