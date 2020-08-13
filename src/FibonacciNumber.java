import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(calcFib(n));
    }

    public static long calcFib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcFib(n - 1) + calcFib(n - 2);
        }
    }
}
