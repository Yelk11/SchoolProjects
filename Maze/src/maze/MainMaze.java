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
public class MainMaze
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        char[][] maze = { 
            { Maze.START, Maze.WALL, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.WALL  },
            { Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL  },
            { Maze.OPEN, Maze.WALL, Maze.WALL, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL  },
            { Maze.WALL, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.END  },
            { Maze.OPEN, Maze.OPEN, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.OPEN, Maze.OPEN, Maze.WALL, Maze.WALL  },
            { Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.OPEN, Maze.OPEN  },
            { Maze.OPEN, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN  },
            { Maze.OPEN, Maze.WALL, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.WALL, Maze.OPEN  },
            { Maze.OPEN, Maze.WALL, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.OPEN  },
            { Maze.OPEN, Maze.OPEN, Maze.OPEN, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL, Maze.WALL  }
        };
        
        Maze myMaze = new Maze(maze);
        myMaze.print();
        myMaze.solve();
        System.out.println("\n\n\n");
        myMaze.print();
    }
    
}
