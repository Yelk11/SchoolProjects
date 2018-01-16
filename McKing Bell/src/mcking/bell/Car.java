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
public class Car
{
    private int startCycle;
    private static final int MAX_ORDER_FRIES = 10;
    private static final int MAX_ORDER_BURGERS = 10;
    Random rand = new Random();
    Car(int cycle)
    {
        this.startCycle = cycle;
    }
    
    public int getStartCycle()
    {
        return this.startCycle;
    }
    
    public int getOrderFries()
    {
        return rand.nextInt(MAX_ORDER_FRIES);
    }
    public int getOrderBurger()
    {
        return rand.nextInt(MAX_ORDER_BURGERS);
    }
}
