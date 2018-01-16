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
public class HoldemSimulator
{
    HoldemSimulator()
    {
        System.out.println("holdem");
        CardDeck deck = new CardDeck();
        deck.shuffle(deck.deckStack);
        Player player_1 = new Player();
        Player shared = new Player();
        // each player gets two cards
        for (int i = 0; i < 2; i++)
        {
            //player_1.giveCard(deck.getNextCard());
            
        }
        // 5 cards go on the shared deck
        for (int i = 0; i < 5; i++)
        {
            //shared.giveCard(deck.getNextCard());
        }
        // calculate the odds of winning
    }
}
