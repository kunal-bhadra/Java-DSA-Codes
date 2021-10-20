package _7_functions_methods;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = in.nextInt();
//        System.out.println(isPrime(num));
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i))
                System.out.print(i + " "); //printing all 3 digit nos for whom isArmstrong returns true
        }
    }

    //to check if number is Armstrong number or not
    static Boolean isArmstrong(int num){
        int sum = 0;
        int cpy = num;
        while(cpy > 0){
            int rem = cpy % 10;
            sum += rem * rem * rem;
            cpy /= 10;
        }
        return sum == num;
    }

    //check if the number given is prime or not
    static Boolean isPrime(int num){
        if (num <= 1)
            return false;

        int c = 2;
        while (c * c <= num){
            if (num % c == 0)
                return false;
            else
                c++;
        }

        return c * c > num; //if it's greater, it will return true otherwise it will return false
    }
}
