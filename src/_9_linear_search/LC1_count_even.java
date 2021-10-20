package _9_linear_search;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class LC1_count_even {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }//returns the count of even numbers in the array

    static boolean isEven(int num){
        int numOfDigits = countDigits2(num);
        return numOfDigits % 2 == 0;
    }//returns true if number is even else false

    static int countDigits2(int num){
        if (num < 0){
            num = num * -1;
        }//if present in array, converting (-)ve no. to (+)ve
        return (int)(Math.log10(num)) + 1;
    }//this is the SHORTCUT way ^ to find no. of digits in a number


    //original method with while loop - less efficient
    static int countDigits(int num){
        if(num < 0){
            num = num * -1;
        }//converts a negative number to positive to count digits, if present in array

        if(num == 0){
            return 1;
        }//edge case to prevent function returning '0 digits' when the number is 0

        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }//returns the number of digits in a number
}
