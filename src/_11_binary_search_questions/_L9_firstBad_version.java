package _11_binary_search_questions;

// https://leetcode.com/problems/first-bad-version/submissions/
//public class _L9_firstBad_version {
//    public int firstBadVersion(int n) {
//        int start = 1;
//        int end = n;
//
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//
//            if(!isBadVersion(mid - 1) && isBadVersion(mid)){
//                return mid;
//            } else if(isBadVersion(mid) && isBadVersion(mid + 1)){
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }
//}
