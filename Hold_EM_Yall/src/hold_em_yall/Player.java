/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hold_em_yall;

/**
 *
 * @author Matt
 */
public class Player
{
    private Card[] hand = new Card[5];
    private int numOfCards = 0;
    public void giveCard(Card c)
    {
        hand[numOfCards] = c;
        numOfCards++;
        System.out.println("inside");
    }
    public Card getCard(int card_num)
    {
        return hand[card_num];
    }
}
