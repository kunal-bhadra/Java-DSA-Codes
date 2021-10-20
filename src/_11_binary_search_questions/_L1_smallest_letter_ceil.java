package _11_binary_search_questions;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
public class _L1_smallest_letter_ceil {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
        //start=N -> wrap around to return letters[start%letters.length]
    }
}