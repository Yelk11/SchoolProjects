/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcking.bell;

/**
 *
 * @author Matt
 */
public class Burger
{
    private int cycle = 0;
    Burger(int currCycle)
    {
        this.cycle = currCycle;
    }
    public int getStartCycle()
    {
        return this.cycle;
    }
}
