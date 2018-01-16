/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enigma;

import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class Enigma_sim
{
    Enigma_sim()
    {
        int shift_1 = 5;
        int shift_2 = 1;
        int shift_3 = 1;
        
        Tumbler tmblr_1 = new Tumbler(shift_1);
        Tumbler tmblr_2 = new Tumbler(shift_2);
        Tumbler tmblr_3 = new Tumbler(shift_3);
        
        PlugBoard plug = new PlugBoard();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the text you would like to encode");
        String str = scan.next();
        str = str.toUpperCase();
        char[] carray = str.toCharArray();
        
        //plug.
        
        carray = plugEncoder(plug, carray);
        
        char[] p = cycleEncode(tmblr_3, cycleEncode(tmblr_2, cycleEncode(tmblr_1, carray)));
        
        System.out.println(p);
        
        char[] o = cycleTranslate(tmblr_3, cycleTranslate(tmblr_2, cycleTranslate(tmblr_1, p)));
        
        o = plugEncoder(plug, o);
        
        System.out.println("Original word");
        System.out.println(o);
    
        
        
    }
    
    
    public char[] cycleEncode(Tumbler t, char[] c)
    {
        char[] answr = new char[c.length];
        for(int i = 0; i < c.length; i++)
        {
            
            
            answr[i] = t.shiftChar(c[i]);
        }
        return answr;
    }
    
    public char[] cycleTranslate(Tumbler t, char[] c)
    {
        char[] answr = new char[c.length];
        for(int i = 0; i < c.length; i++)
        {
            
            answr[i] = t.translate(c[i]);
        }
        return answr;
    }
    
    public char[] plugEncoder(PlugBoard p , char[] c)
    {
        char[] answr = new char[c.length];
        for(int i = 0; i < c.length; i++)
        {
            
            answr[i] = p.encode(c[i]);
        }
        return answr;
    }
    
    
    public char[] plugTranslate(PlugBoard p , char[] c)
    {
        char[] answr = new char[c.length];
        for(int i = 0; i < c.length; i++)
        {
            
            answr[i] = p.translate(c[i]);
        }
        return answr;
    }
    
}
