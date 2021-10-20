package _8_arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tutorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //normally printing the array with for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        //enhanced for loop aka for-each loop
        for (int j : arr) { //here j represents elements of array 'arr'
            System.out.println(j + " "); //for every element in array, print the element
        }

        //printing int array all at once with .toString
        System.out.println(Arrays.toString(arr)); //best way to print arrays (works for strings too)


        //taking a 2D Array as input from the user
        int[][] arr2d = new int [3][2];
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) { //arr2d[row].length -> since each inner array size can vary
                arr2d[row][col] = in.nextInt();
            }
        }

        //printing a 2D array through normal method
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                System.out.print(arr2d[row][col] + " ");
            }
            System.out.println(); //adding a new line after every row, to print array in a matrix format
        }

        //printing 2D array in the most efficient way
        for (int[] num : arr2d) { //in 2D array, the datatype of each element is 1D array itself; hence it's int[] num
            System.out.println(Arrays.toString(arr2d));
        }

        //Working with ArrayList - dynamic arrays with no declaration of size
        //declaration
        ArrayList<Integer> list = new ArrayList<>();

        //manually adding items in the list
        list.add(45);
        list.add(23);

        //taking all items as input into the list
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //printing out all the list values
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }


        //declaring a two-dimensional ArrayList
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
        //initialising the 2D arraylist
        for (int i = 0; i < 3; i++) {
            list2d.add(new ArrayList<>());
        }
        //adding elements to the 2D arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2d.get(i).add(in.nextInt());
            }
        }
        //printing out all the elements in the 2D arraylist
        System.out.println(list2d);
    }

}
