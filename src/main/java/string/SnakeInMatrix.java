package string;

import java.util.List;

public class SnakeInMatrix {
	
    /**
     * Finds the position of snake in a matrix after a series of commands.
     * 
     * @param n Size of the matrix
     * @param commands
     * @return final position of snake.
     */
    public int finalPositionOfSnake(int n, List<String> commands) { 
        int i=0, j=0;
        for(String command : commands){
            if(command.equals("RIGHT")){
              j=j+1;
            }else if(command.equals("LEFT")){
               j=j-1;
            }else if(command.equals("DOWN")){
               i=i+1;
            }else {
               i=i-1;
            }
        }
        return (i*n)+j;
    }
}
