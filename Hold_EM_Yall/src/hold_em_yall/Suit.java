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
public class Suit
{
    public String get(int suitNum)
    {
        
        switch(suitNum)
        {
            case 1: return Suit.HEART;
            case 2: return Suit.DIAMOND;
            case 3: return Suit.SPADE;
            case 4: return Suit.CLUB;
            default: return "WHOOPS";
        }
    }
    public static String HEART = "Hearts";
    public static String DIAMOND = "Diamonds";
    public static String SPADE = "Spades";
    public static String CLUB = "Clubs";
    public static int TOTAL_SUITS = 4;
}
