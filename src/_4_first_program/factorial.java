package _4_first_program;

import java.util.Scanner;
//return the factorial of a number
public class factorial {
    public static void main(String[] args) {
        int n, cpy, fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        n =  sc.nextInt();
        cpy = n;
        while (cpy>0){
            fact *= cpy;
            cpy -= 1;
        }

        System.out.println("The factorial of " +n+ " is: " +fact);
    }
}
