/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywantsapoly;

import java.util.Random;

/**
 *
 * @author Matthew
 */
public class PolyBuilder
{
    LinkedBag p = new LinkedBag<Polynomial>();
    Random rand = new Random();
    
    
    
    
    
    
    PolyBuilder()
    {
        
        int numberOfTerms = 3;
        for (int i = 0; i < numberOfTerms; i++)
        {
            Polynomial poly = new Polynomial();
            poly.ceofficient = rand.nextInt(3);
            poly.exp = rand.nextInt(3);
            p.add(poly);
            
            
            
        }
        
        
        
        
    }
    
    
    
    
    
    
}
