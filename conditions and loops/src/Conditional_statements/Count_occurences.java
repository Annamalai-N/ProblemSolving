package Conditional_statements;

import java.util.Scanner;

public class Count_occurences {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int k = inp.nextInt();
        int val=3;
        int count=0;
         while(k>0){
             int rem=k%10;

             if (rem==val){
                count++;

             }
             int j = k/10;
             k=j;

         }
        System.out.println(count);
    }
}
