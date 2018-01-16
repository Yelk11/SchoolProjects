/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megamillions;

/**
 *
 * @author Matthew
 */
public interface BagInterface
{
    
    public int getCurrentSize();
    public boolean isEmpty();
    
    public boolean add( T item );
    public T remove();
    public boolean remove( T item );
    
    public int getFrequencyOf( T item );
    public boolean contains( T item );
    public T[] toArray();
    
}

