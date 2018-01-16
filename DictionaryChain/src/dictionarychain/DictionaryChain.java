/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarychain;

/**
 *
 * @author Matthew
 */
public class DictionaryChain<K,V>
{
    
    private Entry<K,V>[] hashTable;
    private int numberOfEntries;
    public final static double MAX_LOAD = .75;
    
    public DictionaryChain()
    {
        numberOfEntries = 0;
        
        
        // should be prime size
        hashTable = (Entry[]) new Entry[101];
    }
    
    
    
    public V add(K key, V value)
    {
        //V oldValue = null;
        int index = getHashIndex(key);
        
        
        
        if(hashTable[index] == null)
        {
            hashTable[index] = new Entry(key, value);
            return null;
        }else{
            Entry<K,V> currentEntry = hashTable[index];
            
            while(currentEntry != null)
            {
                if(currentEntry.key == key)
                {
                    V oldValue = currentEntry.value;
                    currentEntry.value = value;
                    return oldValue;
                }
                currentEntry = currentEntry.next;
                
            }
            
            if(currentEntry.key == key)
            {
                V oldValue = currentEntry.value;
                currentEntry.value = value;
                return oldValue;
            }else{
                currentEntry.next = new Entry<K,V>(key,value);
                numberOfEntries++;
                return null;
            }
            
        }
        //return null;
    }
    
    public V remove(K key)
    {
        int index = getHashIndex(key);
        if( hashTable[index] == null)
        {
            return null;
        }
        
        Entry<K,V> currentEntry = hashTable[index];
        
        if( currentEntry.key == key)
        {
            hashTable[index] = currentEntry.next;
            numberOfEntries--;
            return currentEntry.value;
        }
        
        while(currentEntry.next != null)
        {
            if( currentEntry.next.key == key)
            {
                V value = (V)currentEntry.next.value;
                currentEntry.next = currentEntry.next.next;
                numberOfEntries--;
                return value;
            }
            currentEntry = currentEntry.next;
        }
        return null;
    }
    
    
    public V get(K key)
    {
        int index = getHashIndex(key);
        if( hashTable[index] == null)
        {
            return null;
        }
        
        Entry<K,V> currentEntry = hashTable[index];
        
        
        while(currentEntry.next != null)
        {
            if( currentEntry.key == key)
            {
                return currentEntry.value;
            }
            currentEntry = currentEntry.next;
        }
        return null;
    }
    public int size()
    {
        return numberOfEntries;
    }
    public boolean isEmpty()
    {
        return numberOfEntries == 0;
    }
    
    public double loadValue()
    {
        return numberOfEntries / hashTable.length;
    }
    
    public void resize()
    {
        //int nextPrimeSize = getNextPrime(hashTable.length * 2);
        Entry[] oldTable = hashTable;
        hashTable = (Entry[]) new Entry[ getNextPrime(hashTable.length * 2)];
        
        
        
        for(int index = 0; index < hashTable.length; index++)
        {
            if( oldTable[index] != null)
            {
                Entry currentEntry = oldTable[index];
                
                while( currentEntry != null)
                {
                    add(currentEntry.key , currentEntry.value);
                    currentEntry = currentEntry.next;
                }
                
            }
        }
        
        
        
        
        
    }
    private boolean isNextPrime(int n)
    {
        for( int factor = 2; 2 < (int)Math.sqrt(n) + 1; factor++)
        {
            if(n % factor ==0){
                return false;
            }
            
        }
        return true;
    }
    private int getNextPrime(int n)
    {
        while(!isNextPrime(n))
        {
            n++;
        }
        return n;
    }
    private int getHashIndex(K key)
    {
        return key.hashCode() % hashTable.length;
    }
    
    
    
    
    
    

    private class Entry<K,V>
    {
        public K key;
        public V value;
        public Entry next;
        
        public Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
            this.next = next;
            
        }
    }
    
}
