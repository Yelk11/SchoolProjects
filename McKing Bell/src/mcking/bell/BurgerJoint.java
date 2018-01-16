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
public class BurgerJoint
{

    private int numOfBurgers = 0;
    private int numOfFries = 0;

    private int numOfCarsGone = 0;
    private int numOfBurgersThrownOut = 0;

    private static final int MAX_CAR_CYCLE = 5;
    private static final int MAX_NUM_FRIES = 5;
    private static final int MAX_NUM_BURGERS = 5;
    private static final int MAX_CYCLE_BURGERS = 10;

    private LinkedDequeue<Car> carLine = new LinkedDequeue();
    private LinkedDequeue<Burger> burgerLine = new LinkedDequeue();
    private LinkedStack<Fry> fryLine = new LinkedStack();

    public void addCar(Car c)
    {
        carLine.AddToBack(c);
    }

    public void checkCar(int cycle)
    {
        int diff = cycle - carLine.getFront().getStartCycle();
        if (diff > MAX_CAR_CYCLE)
        {
            carLine.removeFront();
            System.out.println("Waited too long");
            numOfCarsGone++;
        }
    }

    public void check(int cycle)
    {
        checkCar(cycle);
        checkBurger(cycle);
        checkFry();
    }

    public void addBurger(int cycle)
    {
        numOfBurgers++;

        Burger burger = new Burger(cycle);
        burgerLine.AddToBack(burger);
    }

    private void checkBurger(int cycle)
    {
        if (numOfBurgers != 0)
        {
            // check if stale
            if (cycle - burgerLine.getFront().getStartCycle() > MAX_CYCLE_BURGERS)
            {

                burgerLine.removeFront();
                numOfBurgers--;
                numOfBurgersThrownOut++;
            }
        }
        // check if low
        if (numOfBurgers < MAX_NUM_BURGERS)
        {
            int diff = MAX_NUM_BURGERS - numOfBurgers;
            for (int i = 0; i < diff; i++)
            {
                addBurger(cycle);
                System.out.println("add burger " + cycle);
            }
        }

    }

    public Burger getBurger()
    {
        numOfBurgers--;
        return burgerLine.removeFront();
    }

    public int getNumOfBurger()
    {
        return numOfBurgers;
    }

    // fries
    public void addFry()
    {

        Fry fry = new Fry();
        fryLine.push(fry);
        numOfFries++;
    }

    private void checkFry()
    {

        if (numOfFries < MAX_NUM_FRIES)
        {
            int diff = MAX_NUM_FRIES - numOfFries;
            for (int i_fry = 0; i_fry < diff; i_fry++)
            {
                addFry();
            }
        }
    }

    public Fry getFry()
    {
        numOfFries--;
        try
        {
            return fryLine.pop();
        } catch (Exception ex)
        {
            return null;
        }
    }

    public int getNumOfFries()
    {
        return numOfFries;
    }

    public void order()
    {
        int orderBurger = carLine.getFront().getOrderBurger();
        int orderFry = carLine.getFront().getOrderFries();
        boolean getFullOrder = true;
        
        
        System.out.println("order burger and fries" + orderBurger + " " + orderFry);
        
        
        if (orderBurger <= numOfBurgers && orderFry <= numOfFries)
        {
            
            for (int i_burg = 0; i_burg < orderBurger; i_burg++)
            {
                getBurger();
            }

            for (int i_fry = 0; i_fry < orderFry; i_fry++)
            {
                getFry();
            }

        } else
        {
            getFullOrder = false;
        }

        //drive off
        if (getFullOrder)
        {
            carLine.removeFront();
        }
    }



    @Override
    public String toString()
    {
        String str = "";
        str = str + "Number of Burgers thrown out: " + numOfBurgersThrownOut + "\n";
        str = str + "Number of cars that drove off: " + numOfCarsGone;
        return str;
    }
}
