package _5_conditionals_loops;
//to count no. of occurrences of a particular digit (1 here)
public class count_nums {
    public static void main(String[] args) {
        int n = 12312;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if (rem==1)
                count++;
            n = n/10;
        }
        System.out.println("Number of times 1 occurred: " +count);
    }
}
