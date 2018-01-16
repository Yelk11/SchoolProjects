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
    double ceofficient = 0;
    int exp = 0;
    Polynomial next;
    
    
    
    public Polynomial add(Polynomial poly)
    {
        Polynomial answr = null;
        /*
         - match Polynomial exponents, and if they match, add the coefficients ( start with first and compare to all in other )

        - if I'm empty but other still has Polynomials, just copy them

        - if the other is empty but I still have polynomials, just copy them
        */
        
        if(poly.exp == exp)
        {
            ceofficient = poly.ceofficient + ceofficient;
        }else if(poly.exp == 0 || exp == 0){
            ceofficient = poly.ceofficient + ceofficient; // if exp is 0, then var is 1
        }
        
        
        
        
        return answr;
    }
    
    
    public Polynomial differentiate()
    {
        
        
        /*
        loop through our Polynomials, exponent goes down by 1, multiply the coefficient by the old exponent


        */
        this.ceofficient = this.ceofficient * this.exp;
        this.exp--;
        
        
        
        return this;
    }
    
    public Polynomial integrate()
    {
        
        Polynomial poly = new Polynomial();
        
        /*
        integrate() - this creates a NEW polynomial, the existing one doesn't change

  loop through our Polynomial, exponent goes up by 1, divide by new exponent
        */
        poly.ceofficient = this.ceofficient;
        poly.exp = this.exp;
        poly.next = this.next;
        
        poly.ceofficient = poly.ceofficient / this.exp;
        
        
        
        return this;
    }
    
    public boolean equals(Polynomial poly)
    {
        boolean isEqual = false;
        
        if(poly.ceofficient == this.ceofficient)
        {
            if(poly.exp == this.exp)
            {
                isEqual = true;
            }
        }
        
        
        
        return isEqual;
    }
    
    
    @Override
    public String toString()
    {
        String str = "";
        str = "" + this.ceofficient;
        str = str + "X^" + this.exp;
        return str;
    }
    
    
    
}
