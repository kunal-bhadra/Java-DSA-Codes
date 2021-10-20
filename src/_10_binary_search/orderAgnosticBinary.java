package _10_binary_search;

public class orderAgnosticBinary {
    public static void main(String[] args) {
        //int[] arr = {2,3,4,45,56,78,89,99};\
        int[] arr = {98, 78, 65, 43, 12, 2};
        int target = 78;
        int ans = orderAgnosticBin(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBin(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)  / 2;

            //common case for both the cases here, hence outside the if loop
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){ //if sorted in ascending order
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { //if sorted in descending order
                if(target > arr[mid]){  //only '>' sign is changed for else case
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        //if nothing has been returned from the while loop, means element doesn't exist, returns -1
        return -1;
    }
}
