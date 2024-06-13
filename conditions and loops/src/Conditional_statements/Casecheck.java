package Conditional_statements;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char ch = inp.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("lower case");
        }
        else {
            System.out.println("upper case");
        }
    }
}
