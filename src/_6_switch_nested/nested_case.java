package _6_switch_nested;

import java.util.Scanner;

public class nested_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter employer ID");
        int empid = in.nextInt();
        System.out.println("Enter department name");
        String dept = in.next();

        switch (empid) {
            case 1 -> System.out.println("This is one");
            case 2 -> System.out.println("This is two");
            case 3 -> {
                System.out.println("This is three");
                switch (dept) {
                    case "English" -> System.out.println("This is english");
                    case "Math" -> System.out.println("This is math");
                    default -> System.out.println("Enter valid department");
                }
            }
            default -> System.out.println("Enter a valid empid");
        }
    }
}
