package _5_conditionals_loops;

import java.util.Scanner;
//making a calculator app
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;
        while(true){
            System.out.println("Enter the operator ");
            char ch = in.next().trim().charAt(0);

            if(ch=='+' || ch=='-' || ch=='/' || ch=='*' || ch=='%'){
                System.out.println("Enter the two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(ch == '+'){
                    ans = num1 + num2;
                }
                else if(ch=='-'){
                    ans = num1 - num2;
                }
                else if(ch=='*'){
                    ans = num1 * num2;
                }
                else if(ch=='/'){
                    if(num2!=0){
                        ans = num1 / num2;
                    }
                }
                else if(ch=='%'){
                    ans = num1 % num2;
                }
                System.out.println("Answer: " +ans);
            }
            else if(ch=='x' || ch=='X'){
                break;
            }
            else{
                System.out.println("Invalid operation");
            }
        }
    }
}
