/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingexamples;

import java.util.Comparator;

/**
 *
 * @author Matthew
 */
public class StringLengthSort implements Comparator<String>
{
    @Override
    public int compare(String thing1, String thing2)
    {
        int length_diff = thing1.length() - thing2.length();
        
        if(length_diff != 0)
        {
            return length_diff;
        }else{
            
            return thing1.compareTo(thing2);
        }
        
    }
    
    
}
