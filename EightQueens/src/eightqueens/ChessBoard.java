/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightqueens;



/**
 *
 * @author Matthew
 */
public class ChessBoard
{
    public final int MAX_X = 8;
    public final int MAX_Y = 8;
    //                          x  y
    private Queen[][] board = new Queen[MAX_X][MAX_Y];
    
    private int currX = 0;
    private int currY = 0;
    
    public void set(Queen q, int x, int y)
    {
        board[x][y] = q;
        
    }
    public boolean isEmpty(int x, int y)
    {
        return board[x][y] == null;
    }
    
    public boolean isEmpty()
    {
        return isEmpty(this.currX, this.currY);
    }
    
    public void reset()
    {
        this.currX = 0;
        this.currY = 0;
    }
    
    public void reset(int newX)
    {
        this.currX = newX;
        this.currY = 0;
    }
    
    public void up()
    {
        if(this.currY < MAX_Y - 1)
        {
            this.currY++;
        }  
    }
    
    public void down()
    {
        if(this.currY > 0)
        {
            this.currY--;
        }  
    }
    
    public void right()
    {
        if(this.currX < MAX_X - 1)
        {
            this.currX++;
        }
    }
    
    public void left()
    {
        if(this.currX > 0)
        {
            this.currX--;
        }  
    }
    
    public void addQueen()
    {
        Queen queen = new Queen(this.currX,this.currY);
        board[this.currX][this.currY] = queen;
    }
    public void addQueen(int x, int y)
    {
        Queen queen = new Queen(x,y);
        board[x][y] = queen;
    }
    
    public void removeQueen()
    {
        board[this.currX][this.currY] = null;
    }
    public void removeQueen(int x, int y)
    {
        board[x][y] = null;
    }
    
    public int getCurrX()
    {
        return this.currX;
    }
    
    public int getCurrY()
    {
        return this.currY;
    }
    public boolean inDanger(int x, int y)
    {
        if(checkSides(x,y))
        {
            return true;
        }else if(checkCorners(x,y))
        {
            return true;
        }else{
            return false;
        }
        
    }
    public void setPosition(int x, int y)
    {
        this.currX = x;
        this.currY = y;
    }
    public boolean checkSides(int x, int y)
    {
        boolean inDanger = false;
        for (int x_local = 0; x_local < MAX_X; x_local++) //  '/'
        {
            for (int y_local = 0; y_local < MAX_Y; y_local++)
            {
                //System.out.println("with current x and y: " + this.currX + " : " + this.currY);
                if(board[x_local][y_local] != null)
                {
                    if(y_local == y) // y2 - y1 == x2 - x1
                    {
                        //System.out.println("with current x and y: " + x_local + " : " + y_local);
                        inDanger = true;
                    }
                    
                }
            }
            
        }
        for (int x_local = 0; x_local < MAX_X; x_local++) //  '/'
        {
            for (int y_local = 0; y_local < MAX_Y; y_local++)
            {
                //System.out.println("with current x and y: " + this.currX + " : " + this.currY);
                if(board[x_local][y_local] != null)
                {
                    if(x_local == x) // y2 - y1 == x2 - x1
                    {
                        //System.out.println("with current x and y: " + x_local + " : " + y_local);
                        inDanger = true;
                    }
                    
                }
            }
            
        }
        
        return inDanger;
    }
    public boolean checkCorners(int x, int y)
    {
        boolean inDanger = false;
        for (int x_local = 0; x_local < MAX_X; x_local++) //  '/'
        {
            for (int y_local = 0; y_local < MAX_Y; y_local++)
            {
                //System.out.println("with current x and y: " + this.currX + " : " + this.currY);
                if(board[x_local][y_local] != null)
                {
                    if(y_local - y == x_local - x) // y2 - y1 == x2 - x1
                    {
                        //System.out.println("with current x and y: " + x_local + " : " + y_local);
                        inDanger = true;
                    }
                    
                }
            }
            
        }
        
        for (int x_local = 0; x_local < MAX_X; x_local++) //  '\'
        {
            for (int y_local = MAX_Y - 1; y_local >= 0; y_local--)
            {
                
                if(board[x_local][y_local] != null)
                {
                    if(y_local - y ==  y - x_local) //y2 - y1 == x1 - x2
                    {
                        //System.out.println("danger at x and y: " + x_local + " : " + y_local);
                        inDanger = true;
                    }
                    
                }
            }
        }
        
        return inDanger;
    }
    
    @Override
    public String toString()
    {
        for(int x = 0; x < MAX_X; x++)
        {
            for(int y = 0; y < MAX_Y; y++)
            {
                if(isEmpty(x,y))
                {
                    //System.out.print("(" + x + "," + y + ")" + "0");
                    System.out.print("0");
                }else{
                    //System.out.print("(" + x + "," + y + ")" + "X");
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        return "Nothing";
    }
}
