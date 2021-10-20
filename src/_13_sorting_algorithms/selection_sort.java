package _13_sorting_algorithms;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {2,3,2,312,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            //find the max in unsorted sub-array and swap with correct index
            int last = arr.length - i - 1; //largest (correct) index at first
            int maxIndex = getMaxIndex(arr, 0, last); //index with max value at that iteration

            swapArray(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i<= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swapArray(int[] arr, int first, int second){
        //swapping two indices
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
