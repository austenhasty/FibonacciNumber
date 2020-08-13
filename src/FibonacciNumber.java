import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(calcFib(n));
    }

 /*   public static long calcFib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcFib(n - 1) + calcFib(n - 2);
        }
    } */

    public static long calcFib(int n) {
        if (n <= 1) {
            return n;
        }
        long[] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]);
//            System.out.println("arr[i] = "+ arr[i]);
        }
        return arr[n];
    }
}
