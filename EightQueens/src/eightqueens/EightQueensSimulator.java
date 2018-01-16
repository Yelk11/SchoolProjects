/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightqueens;

/**
 *
 * @author Matt
 */
public class EightQueensSimulator
{

    ChessBoard board = new ChessBoard();

    EightQueensSimulator()
    {
        /*
        int x1 = 1;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        int x3 = 2;
        int y3 = 1;
        Queen q1 = new Queen(x1,y1);
        Queen q2 = new Queen(x2,y2);
        Queen q3 = new Queen(x3,y3);
        board.set(q1, x1, y1);
        board.set(q2, x2, y2);
        board.set(q3, x3, y3);
        board.setPosition(x3, y3);
        System.out.println("current x" + board.getCurrX());
        System.out.println(board.checkCorners());
         */

        placeQueens(0, 0, board);
        System.out.println(board.inDanger(1, 1));
        board.toString();

    }

    public void placeQueens(int numQueen, int curPosY, ChessBoard b)
    {
         
        if (numQueen < b.MAX_X) {

            if (curPosY >= b.MAX_Y) {
                System.out.println("REVERT start: " + numQueen + " , " + curPosY + " , " + b.inDanger(numQueen, curPosY));
                clean(numQueen,b);
                if (numQueen == 0) {
                    numQueen = 0;
                } else {
                    numQueen--;
                }
                curPosY = 0;
                System.out.println("REVERT end: " + numQueen + " , " + curPosY + " , " + b.inDanger(numQueen, curPosY));
                
                placeQueens(numQueen, curPosY, b);
            } else if (b.inDanger(numQueen, curPosY)) {
                System.out.println("DANGER start: " + numQueen + " , " + curPosY + " , " + b.inDanger(numQueen, curPosY));
                //clean(numQueen,b);
                curPosY++;
                System.out.println("DANGER end: " + numQueen + " , " + curPosY + " , " + b.inDanger(numQueen, curPosY));
                
                placeQueens(numQueen, curPosY, b);
            } else{
                System.out.println("SUCCESS start: " + numQueen + " , " + curPosY + " , " + b.inDanger(numQueen, curPosY));
                if(!b.inDanger(numQueen, curPosY) && numQueen < b.MAX_X)
                {
                    b.addQueen(numQueen, curPosY);
                    b.toString();
                }
                
                
                numQueen++;
                curPosY = 0;
                System.out.println("SUCCESS end: " + numQueen + " , " + curPosY + " , " + b.inDanger(numQueen, curPosY));
                
                placeQueens(numQueen, curPosY, b);
            }
            
            //b.toString();
            System.out.println("end " + numQueen + " : " + curPosY);
            //placeQueens(numQueen, curPosY, b);
        } else {
            System.out.println("DONE");
        }
    }

    public void clean(int x, ChessBoard b)
    {
        for (int i = 0; i < b.MAX_Y; i++) {
            for (int p = x; p < b.MAX_X; p++) {
                b.removeQueen(p, i);
            }

        }
    }

}
