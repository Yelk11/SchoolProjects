/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matt
 */
public class PlugBoard
{
    private final DictionaryChain chainScrambler = new DictionaryChain();
    private final DictionaryChain chainTranslate = new DictionaryChain();
    private final Random rand = new Random();
    private final LinkedStack stack_0 = new LinkedStack();
    private final LinkedStack stack_1 = new LinkedStack();
    private final LinkedStack stack_2 = new LinkedStack();
    PlugBoard()
    {
        scrambler();
    }
    
    public char translate(char c)
    {
        return (char) chainTranslate.get(c);
    }
    public char encode(char c)
    {
        return (char) chainScrambler.get(c);
    }
    
    private void scrambler()
    {
        for (char alpha = 'A'; alpha <= 'Z'; alpha++)
        {
            //if(rand.nextInt(100) % 2 ==0)
            if(true)
            {
                stack_1.push(alpha);
            }else{
                stack_2.push(alpha);
            }
        }
        
        while(!stack_1.isEmpty())
        {
            try {
                stack_0.push(stack_1.pop());
            } catch (Exception ex) {
                Logger.getLogger(PlugBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while(!stack_2.isEmpty())
        {
            try {
                stack_0.push(stack_2.pop());
            } catch (Exception ex) {
                Logger.getLogger(PlugBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for (char alpha = 'A'; alpha <= 'Z'; alpha++)
        {
            
            try {
                char temp = (char) stack_0.pop();
                chainScrambler.add(temp,alpha);
                chainTranslate.add(alpha, temp);
            } catch (Exception ex) {
                Logger.getLogger(PlugBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
