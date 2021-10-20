package _7_functions_methods;

import java.util.Scanner;

public class tutorial {
    public static void main(String[] args) {
//        int ans = sum();
//        System.out.println("The sum1 is " +ans);
        int ans2 = sum2(10, 34);
        System.out.println("The sum2 is " +ans2);
    }

    //using parameters
    static int sum2(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the two numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }
}
