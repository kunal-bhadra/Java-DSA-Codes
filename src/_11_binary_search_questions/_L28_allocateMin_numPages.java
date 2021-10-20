package _11_binary_search_questions;

// https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1#
public class _L28_allocateMin_numPages {
    //Function to find minimum number of pages.
    static boolean isPossible(int arr[], int n, int m, int curr_min)
    {
        int studentsRequired = 1;
        int curr_sum = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > curr_min)
                return false;
            if (curr_sum + arr[i] > curr_min)
            {
                studentsRequired++;
                curr_sum = arr[i];
                if (studentsRequired > m)
                    return false;
            }
            else
                curr_sum += arr[i];
        }
        return true;
    }

    static int findPages(int arr[], int n, int m)
    {
        long sum = 0;

        if (n < m) //no. of books < no. of students
            return -1;

        // Count total number of pages
        for (int i = 0; i < n; i++)
            sum += arr[i];

        int start = 0, end = (int) sum;
        int result = Integer.MAX_VALUE;

        while (start <= end)
        {
            // check if it is possible to distribute
            // books by using mid is current minimum
            int mid = (start + end) / 2;
            if (isPossible(arr, n, m, mid)){
                result = mid;
                end = mid - 1; //to see if a lesser min is possible
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
