package _6_switch_nested;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Watermelon":
                System.out.println("Fruit full of water");
                break;
            case "grape":
                System.out.println("Very small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
                break;
        }

        //enhanced switch syntax
        int day = in.nextInt();
        switch (day) {
            case 1 -> {
                System.out.println("Monday"); //for multiple statements in one case
            }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        int day2 = in.nextInt();
        switch (day2) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid");
        }

    }
}
