//WAP to return sum of squares of numbers in given range (1-n).

import java.util.Scanner;

public class SumOfSquares {
    public static int sum(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i*i;
        }
        System.out.println(sum);
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        sum(n);
    }
}
