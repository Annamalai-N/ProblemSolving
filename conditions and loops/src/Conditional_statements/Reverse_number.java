package Conditional_statements;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();
        int rev = 0;
        while (k > 0) {
            int rem = k % 10;
            k=k/10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
