package _4_first_program;

import java.util.Scanner;
//calculate the sum of all numbers entered by user and return when he enters 0
public class sum_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum=0;
        System.out.print("Enter the numbers till 0:");
        num = sc.nextInt();
        while(num!=0){
            sum +=num;
            num=sc.nextInt();
        }
        System.out.println("The sum is: " +sum);
    }
}
