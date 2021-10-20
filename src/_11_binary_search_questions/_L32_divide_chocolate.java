package _11_binary_search_questions;

public class _L32_divide_chocolate {
    public static void main(String[] args) {
        int[] sweet = {1,2,2,1,2,2,1,2,2};
        int people = 2;
        System.out.println((divideChocolate(sweet, people)));
    }

    static int divideChocolate(int[] sweet, int people) {
        int start = 0, end = 0;
        for(int num : sweet){
            start = Math.min(start, num);
            end += num;
        }

        while(start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for(int num : sweet) {
                if (sum + num > mid) {
                    sum = 0;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > people + 1){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
