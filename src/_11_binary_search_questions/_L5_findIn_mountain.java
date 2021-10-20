package _11_binary_search_questions;

//https://leetcode.com/problems/find-in-mountain-array/submissions/
//public class _L5_findIn_mountain {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = findPeak(target, mountainArr);
//        int targetInAsc = orderAgnosticBinarySearch(target, mountainArr, 0, peak);
//        if (targetInAsc != -1){
//            return targetInAsc;
//        }
//        int targetInDesc =  orderAgnosticBinarySearch(target, mountainArr, peak + 1, mountainArr.length() - 1);
//        return targetInDesc;
//    }
//
//    int findPeak(int target, MountainArray mountainArr){
//        int len = mountainArr.length();
//        int start = 0;
//        int end = len - 1;
//
//        //applying same logic as findPeak to find index of maximum element in array
//        //this will be our end index for binary search
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            int v = mountainArr.get(mid); //to lessen the calls made
//
//            if(v < mountainArr.get(mid + 1)){
//                start = mid + 1;
//            } else if(mountainArr.get(mid - 1) > v){
//                end = mid - 1;
//            } else {
//                return mid; //got our end index
//            }
//        }
//        return -1;
//    }
//
//    int orderAgnosticBinarySearch(int target, MountainArray mountainArr, int start, int end){
//        while (start <= end){
//            int mid = start + (end - start) / 2;
//            int v = mountainArr.get(mid); //to lessen the calls made
//            boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
//
//            if(target == v){
//                return mid;
//            }
//            if(isAsc){
//                if(target > v){
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//            else{
//                if(target < v){
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }
//}
