package _4_first_program;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        //Primitive data types
        int roll = 64;
        char ch = 'd';
        float marks = 99.50f;
        double largeDecimalNumbers = 29347234.1239137; //default data type for decimals
        long largeIntegerValues = 123092713132122L;
        boolean check = true;

        //Type Casting
        int num = (int)(67.56f);
        System.out.println("Printing the float number as int: " +num);

        //Automatic type conversion in expression
        int a = 257;
        byte b = (byte)(a);
        System.out.println("Byte is: " +b);
        //max stored in byte can be 256 only. this is why b stores the remainder here - 1

        byte c = 50;
        byte d = 40;
        byte e = 100;
        int f = c * d / e; //evaluates the expression in integer format, not byte since 'f' is of int type
        System.out.println(f);

    }
}
