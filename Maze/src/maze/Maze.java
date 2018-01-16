/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

/**
 *
 * @author Matthew
 */
public class Maze
{
    private char[][] maze;
    
    public static char WALL = 'x';
    public static char OPEN = ' ';
    public static char STONE = '.';
    public static char START = 'S';
    public static char END = 'E';
    
    public int colStart;
    public int rowStart;
    private boolean unSolved;
    
    public Maze(char[][] maze)
    {
        this.maze = maze;
        unSolved = true;
        colStart = -1;
        rowStart = -1;
        
        for (int row = 0; row < maze.length; row++)
        {
            for (int col = 0; col < maze[row].length; col++)
            {
                if(maze[row][col] == Maze.START)
                {
                    colStart = col;
                    rowStart = row;
                }
                
            }
        }
    }
    
    public void print()
    {
        for (int row = 0; row < maze.length; row++)
        {
            for (int col = 0; col < maze[row].length; col++)
            {
               System.out.print(maze[row][col]);
                
            }
            System.out.println();
        }
    }
    
    public void solve()
    {
        solve(rowStart, colStart);
    }
    
    public void solve(int row, int col)
    {
        if(maze[row][col] == Maze.END)
        {
            System.out.println("WINNER WINNER CHICKEN DINNER!!!");
            unSolved = false;
        }else{
            maze[row][col] = Maze.STONE;
        }
        
        //SOUTH
        if(canGo(row+1,col))
        {
            solve(row+1, col);
        }
        
        //EAST
        if(canGo(row,col+1))
        {
            solve(row, col+1);
        }
        
        //SOUTH
        if(canGo(row-1,col))
        {
            solve(row-1, col);
        }
        
        //SOUTH
        if(canGo(row,col-1))
        {
            solve(row, col-1);
        }
        
        if(row == rowStart && col == colStart && unSolved)
        {
            System.out.println("LOSERRRR!!");
        }
        
    }
    
    private boolean canGo(int row, int col)
    {
        return unSolved && row >= 0 && col >= 0 && row < maze.length && col < maze[row].length && (
                maze[row][col] == Maze.OPEN || maze[row][col] == Maze.END);
    }
}
