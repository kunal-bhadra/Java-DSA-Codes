package _5_conditionals_loops;

import java.util.Scanner;
//to check for largest number in 3 numbers
public class largest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        int max = a;
//        if (b>max){
//            max = b;
//        }
//        else if (c>max){
//            max = c;
//        }
        int max = Math.max(a, Math.max(b,c));
        System.out.println("Largest number is: " +max);
    }

}
