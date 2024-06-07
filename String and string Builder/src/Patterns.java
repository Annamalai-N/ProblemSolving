public class Patterns {
    public static void main(String[] args) {


 pattern_problem32(5);
    }


    static void pattern_problem6(int n){
        for(int row=0;row<=2*n-1;row++){
            // for every row ,run the column
            int totalcolumn=row>n? n*2-row:row;
            int spaces=n-totalcolumn;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalcolumn;col++){
                System.out.print("* ");
            }
            //when one row is printed we need to print the new line
            System.out.println();
        }
    }
    static void pattern_problem2(int n){
        for(int row=0;row<=n;row++){
            // for every row ,run the column
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }
            //when one row is printed we need to print the new line
            System.out.println();
        }
    }
    static void pattern_problem(int n){
        for(int row=0;row<=n;row++){
            // for every row ,run the column
            for(int col=0;col<=row;col++){
                System.out.print("*");
            }
            //when one row is printed we need to print the new line
            System.out.println();
        }
    }

    static void pattern_problem3(int n){
        for(int row=1;row<=n;row++){
            // for every row ,run the column
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            //when one row is printed we need to print the new line
            System.out.println();
        }
    }

    static void pattern_problem5(int n){
        for(int row=0;row<=2*n-1;row++){
            // for every row ,run the column
            int totalcolumn=row>n? n*2-row:row;
            for(int col=0;col<totalcolumn;col++){
                System.out.print("*");
            }
            //when one row is printed we need to print the new line
            System.out.println();
        }
    }
    static void pattern_problem30(int n){
        for(int row=1;row<=n;row++){

            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int left=2;left<=row;left++){
                System.out.print(left);
            }
            System.out.println(" ");
        }
    }

    static  void pattern_problem32(int n){
        int originalval=n;
        n=2*n;
        for(int row=0;row<n;row++){
            for(int col=0;col<=n;col++){
                int ateveryindex= originalval-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }
    }


}



