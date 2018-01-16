/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcking.bell;

import java.util.Random;

/**
 *
 * @author Matt
 */
public class McKingBell_Sim
{
    private static final int MAX_CYCLE = 120;
    
    McKingBell_Sim()
    {
        
        BurgerJoint b = new BurgerJoint();
        
        Car c;
        Random rand = new Random();
        for(int cycle = 0; cycle <= MAX_CYCLE; cycle++)
        {
            
            
            
            
            System.out.println("Cycle: " + cycle);
            b.addCar(c = new Car(cycle));
            if(rand.nextInt(3) == 1)
            {
                b.addCar(c = new Car(cycle));
                System.out.println("Car added");
            }
            b.order();
            b.check(cycle);
        }
        System.out.println(b.toString());
    }
    
}
