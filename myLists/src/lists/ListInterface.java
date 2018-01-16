/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

/**
 *
 * @author Matthew
 * @param <T>
 */
public interface ListInterface<T>
{
    void add(T newEntry);
    void add ( int newPosition, T newEntry);
    T remove(int givenPosition);
    void clear();
    T replace( int givenPosition, T newEntry);
    T getEntry( int givenPosition );
    boolean contains( T anEntry );
    int getLength();
    boolean isEmpty();
}
