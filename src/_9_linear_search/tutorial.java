package _9_linear_search;

public class tutorial {
    public static void main(String[] args) {
        int[] arr = {1,2,23,123,31,213,123123,123,312};
        int target = 213;
        int ans = linearSearch(arr, target);
        System.out.println("The index of the item is: " +ans);
    }

    // searches the array. returns index of item if found
    // otherwise if item is not found, then it returns -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
         //run for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { //check every array element is the target that we're searching for
                return i; //returns index if target item is found
            }
        }

        //this line will execute if none of the above return statements have been executed; target not found
        return -1;
    }
}
