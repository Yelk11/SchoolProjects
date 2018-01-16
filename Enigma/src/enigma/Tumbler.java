/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import java.util.Random;

/**
 *
 * @author Matt
 */
public class Tumbler
{
    private int shift = 0;
    private DictionaryChain chain = new DictionaryChain();
    Tumbler(int shift)
    {
        this.shift = shift;
        for (char alpha = 'A'; alpha <= 'Z'; alpha++)
        {
            
            chain.add(alpha, shiftChar(alpha));
        }
    }
    
    
    
    public char shiftChar(char c)
    {
        int value = Character.getNumericValue(c) + 55 + this.shift;
        if ( value > 90 )
        {
            value -= 26;
        }
        return Character.toChars( value )[0];
    }
    /*
    public char translate(char c)
    {
        return (char) chain.get(c);
    }
    */
    
    public char translate(char c)
    {
        int value = Character.getNumericValue(c) + 55 - this.shift;
        if ( value > 90 )
        {
            value -= 26;
        }
        return Character.toChars( value )[0];
    }
    
}
