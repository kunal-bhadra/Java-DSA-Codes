package _5_conditionals_loops;
//prints the reverse of a given number
public class reverse_no {
    public static void main(String[] args) {
        int n = 213131894;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println("Reverse is: " +rev);
    }
}
