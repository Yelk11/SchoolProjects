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
public class Face
{

    public static int ACE = 14;
    public static int KING = 13;
    public static int QUEEN = 12;
    public static int JACK = 11;
    public static int TEN = 10;
    public static int NINE = 9;
    public static int EIGHT = 8;
    public static int SEVEN = 7;
    public static int SIX = 6;
    public static int FIVE = 5;
    public static int FOUR = 4;
    public static int THREE = 3;
    public static int TWO = 2;
    public static int TOTAL_FACES = 14;

    public int get(int num)
    {
        switch (num)
        {
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            case 9:
                return NINE;
            case 10:
                return TEN;
            case 11:
                return JACK;
            case 12:
                return QUEEN;
            case 13:
                return Face.KING;
            case 14:
                return ACE;
            default: return 0;
        }
    }
}
