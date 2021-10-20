package _13_sorting_algorithms;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) { //can do swap function also
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
