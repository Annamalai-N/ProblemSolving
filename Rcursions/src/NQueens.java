import java.sql.SQLOutput;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        Queens(board,0);
        System.out.println(Queens(board,0));
    }
    static int Queens(boolean[][] board,int row){
        if(row==board.length){
            Display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        // placing the queens and checking for every row and column
        for (int col = 0; col <board.length ; col++) {
            //place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=Queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i <row ; i++) {
            if(board[i][col]==true){
                return false;
            }

        }
        int maxleft=Math.min(row,col);
        //for left
        for (int i = 1; i <=maxleft; i++) {
            if(board[row-i][col-i]){
                return false;
            }

        }
        //diaganol right
        int maxright=Math.min(row,board.length-col-1);
        for (int i = 1; i <=maxright; i++) {
            if(board[row-i][col+i]){
                return false;
            }

        }
        return true;


    }

    private static void Display(boolean[][] board) {
        for(boolean[]row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


}
