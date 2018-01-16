/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywantsapoly;

/**
 *
 * @author Matthew
 */
public class Polynomial
{
    double ceofficient;
    int exp;
    Polynomial next;
    
    
    
    public Polynomial add(Polynomial poly)
    {
        Polynomial answr = null;
        /*
         - match Polynomial exponents, and if they match, add the coefficients ( start with first and compare to all in other )

        - if I'm empty but other still has Polynomials, just copy them

        - if the other is empty but I still have polynomials, just copy them
        */
        
        
        
        
        
        
        
        
        return answr;
    }
    
    
    public Polynomial differentiate()
    {
        
        Polynomial answr = null;
        /*
        loop through our Polynomials, exponent goes down by 1, multiply the coefficient by the old exponent

integrate() - this creates a NEW polynomial, the existing one doesn't change

  loop through our Polynomial, exponent goes up by 1, divide by new exponent
        */
        return answr;
    }
    
    public boolean equals(Polynomial poly)
    {
        boolean isEqual = false;
        
        
        
        
        return isEqual;
    }
    
    
    @Override
    public String toString()
    {
        String str = "";
        
        return str;
    }
    
    
    
}
