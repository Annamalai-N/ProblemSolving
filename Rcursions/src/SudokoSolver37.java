public class SudokoSolver37 {
    public static void main(String[] args) {

    }

    static boolean solve(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyleft=true;
        //this is how we are replacing r,c arguments
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyleft=false;
                    break;
                }
            }
            //if ypu found some any element in row then break
            if(emptyleft==false){
                break;
            }
        }
        if(emptyleft==true){
            return true;
            //sudoko is solved
        }

        for (int number = 1; number <=9 ; number++) {
            if(isSafe(board,row,col,number)){
                board[row][col]=number;
            }
            if(solve(board)){
                //found your answer
                return true;
                display(board);
            }else {
                //backtrack
                board[row][col]=0;
            }
        }

        return false;
    }

    private static void display(int[][] board) {
        for(int[] row:board){
            for(int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board,int row, int col,int num){
        //check the row
        for (int i = 0; i < board.length; i++) {
            //check if the number is in the row
            if(board[row][col]==num){
                return false;

            }
            
        }
        //check for the columm
        for (int[] nums:board) {
            //check if the number is in the col
            if(nums[col]==num){
                return false;

            }
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int Rowstart=row-row%sqrt;
        int Colstart=col-col%sqrt;
        for (int r = Rowstart; r <Rowstart+sqrt ; r++) {
            for (int c = Colstart; c < Colstart+sqrt; c++) {
                if(board[r][c]){
                    return false;
                }

            }
            
        }
        return true;
    }
}
