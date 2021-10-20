package _9_linear_search;

//find the minimum element in the array
public class _q3_find_min {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,14,28};
        System.out.println("The minimum is " +findMin(arr));
    }

    //assuming arr.length!=0 here
    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
