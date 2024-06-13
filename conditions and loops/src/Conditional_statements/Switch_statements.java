package Conditional_statements;

import java.util.Scanner;

public class Switch_statements {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String fruit= inp.nextLine();

        switch (fruit) {
            case "mango":
                System.out.println("Mango");
                break;
            case "apple":
                System.out.println("Apple");
                break;
            case "grape":
                System.out.println("grape");
                break;


        }
    }
}
