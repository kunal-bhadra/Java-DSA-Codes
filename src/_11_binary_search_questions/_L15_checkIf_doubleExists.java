package _11_binary_search_questions;

import java.util.Arrays;

// https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class _L15_checkIf_doubleExists {
    public static void main(String[] args) {
        int[] array = {10,2,5,3};
        System.out.println(checkIfExist(array));
    }

    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int zeroCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                if(binarySearch(arr, arr[i] * 2, i)){
                    return true;
                }
            } else {
                zeroCount++;
            }

        }
        //returns false if no double present and also if zeros are present twice
        return zeroCount >= 2;
    }

    static boolean binarySearch(int[] arr, int num, int index){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(num > arr[mid]){
                start = mid + 1;
            } else if(num < arr[mid]){
                end = mid - 1;
            } else if(mid != index){
                return true;
            }
        }

        return false;
    }
}
