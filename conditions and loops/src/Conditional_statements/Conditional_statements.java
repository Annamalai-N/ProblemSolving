package Conditional_statements;
import java.util.Scanner;


public class Conditional_statements {
    public static void main(String[] args) {
        // find the largest of three numbers
        Scanner jk = new Scanner(System.in);
        int a = jk.nextInt();
        int b = jk.nextInt();
        int c = jk.nextInt();

        int mat = a;
        if (b>mat){
            mat=b;
        }
        if (c>mat){
            mat=c;
        }


        System.out.println(mat);
    }
}
