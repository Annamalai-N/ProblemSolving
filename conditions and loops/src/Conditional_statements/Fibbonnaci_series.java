package Conditional_statements;

import java.util.Scanner;

public class Fibbonnaci_series {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while (count<=n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
