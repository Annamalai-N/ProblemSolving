import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        //BackTarckingEX("",board,0,0);
        int[][] path=new int[board.length][board[0].length];
        BackTarckingPrintAllPath("",board,0,0,path,1);
    }
    static void BackTarckingEX(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        //setting it false for the visited path
        maze[r][c]=false;

        if(r<maze.length-1){
            BackTarckingEX(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            BackTarckingEX(p+'R',maze,r,c+1);
        }
        if(r>0){
            BackTarckingEX(p+"U",maze,r-1,c);
        }
        if(c>0){
            BackTarckingEX(p+"L",maze,r,c-1);
        }
        //the function will be over in this line
        //so before the function gets removed and also remove the changes that were made by the previous function
        maze[r][c]=true;
    }

    static void BackTarckingPrintAllPath(String p,boolean[][] maze,int r,int c,int[][]path,int  step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for (int[] arr:path) {
                System.out.println(Arrays.toString(arr));
                
            }
            System.out.println(p);

            return;
        }
        if(!maze[r][c]){
            return;
        }
        //setting it false for the visited path
        maze[r][c]=false;
        path[r][c]=step;

        if(r<maze.length-1){
            BackTarckingPrintAllPath(p+'D',maze,r+1,c,path,step+1);

        }
        if(c<maze[0].length-1){
            BackTarckingPrintAllPath(p+'R',maze,r,c+1,path,step+1);

        }
        if(r>0){
            BackTarckingPrintAllPath(p+"U",maze,r-1,c,path,step+1);

        }
        if(c>0){
            BackTarckingPrintAllPath(p+"L",maze,r,c-1,path,step+1);

        }
        //the function will be over in this line
        //so before the function gets removed and also remove the changes that were made by the previous function
        maze[r][c]=true;
        path[r][c]=0;
    }
}
