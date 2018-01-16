/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hold_em_yall;

/**
 *
 * @author Matthew
 */
public class Card
{
    private int myFace;
    private String mySuit;
    
    Face face = new Face();
    Suit suit = new Suit();
    
    public Card(int newFace, String newSuit)
    {
        this.myFace = newFace;
        this.mySuit = newSuit;
    }
    
    public int getFace()
    {
        return myFace;
    }
    
    public String getSuit()
    {
        return mySuit;
    }
    public void setSuit(String suit)
    {
        this.mySuit = suit;
    }
    public void setFace(int face)
    {
        this.myFace = face;
    }
}
