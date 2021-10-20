package _8_arrays_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Q1: Swapping values in an array
        int[] arr = {1, 2, 3 ,4, 1231, 123, 21};
        swap(arr, 2, 4);
        System.out.println(Arrays.toString(arr));

        //Q2: Finding the maximum value of an array
        System.out.println(max(arr));

        //Q3: Reversing an array
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        //doing the reverse using the swap function below | two pointer method**
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
            int j = arr[i];
            if (j > max)
                max = j;
        }
        return max;
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
