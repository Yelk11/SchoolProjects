/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hold_em_yall;


import java.util.Random;
import stacks.LinkedStack;

/**
 *
 * @author Matthew
 */
public class CardDeck
{
    int SIZE_OF_DECK = 52;
    LinkedStack deckStack = new LinkedStack();
    Face f = new Face();
    Suit s = new Suit();
    CardDeck()
    {
        Card n = null;
        for (int currentFace = 1; currentFace <= Face.TOTAL_FACES; currentFace++)
        {
            for (int currentSuit = 1; currentSuit <= Suit.TOTAL_SUITS; currentSuit++)
            {
                
                n = new Card(f.get(currentFace), s.get(currentSuit));
                deckStack.push(n);
            }
        } 
    }
    
    
    
    public LinkedStack shuffle(LinkedStack stack)
    {
        LinkedStack deckOne = new LinkedStack();
        LinkedStack deckTwo = new LinkedStack();
        LinkedStack deckThree = new LinkedStack();
        
        Random rand = new Random();
        
        int r = 0;
        while(stack.isEmpty() == false)
        {
            r = rand.nextInt(3);
            if(r ==1)
            {
                try{
                    deckOne.push(stack.pop());
                }catch(Exception e){
                    
                }
                
            }else if(r == 2)
            {
                try{
                    deckTwo.push(stack.pop());
                }catch(Exception e){
                    
                }
                
            }else{
                try{
                    deckThree.push(stack.pop());
                }catch(Exception e){
                    
                }
                
            }
        }
        
        while(deckTwo.isEmpty() == false)
        {
            try{
                deckOne.push(deckTwo.pop());
            }catch(Exception e){
                
            }
        }
        while(deckTwo.isEmpty() == false)
        {
            try{
                deckOne.push(deckTwo.pop());
            }catch(Exception e){
                
            }
        }
        
        return deckOne;
    }
    
    public Card getNextCard()
    {
        try {
            return (Card) deckStack.pop();
        } catch (Exception ex) {
            System.out.println("No More Cards");
            return null;
        }
        
    }
    
    
    
    
}
