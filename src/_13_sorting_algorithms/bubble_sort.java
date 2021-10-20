package _13_sorting_algorithms;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {-1, 7, -32, 89};
         bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped; //to check if array is already sorted

        for(int i = 0; i < arr.length; i++){
            swapped = false;
            //run the steps n-1 times
            //for each step, max item will come at last respective index
            for(int j = 1; j < arr.length - 1; j++){
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                //if for any particular iteration of i, no swap takes place
                //for all the elements, then array is now sorted. so break out
                break;
            }
        }
    }
}
