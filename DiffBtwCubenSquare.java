//WAP to return the difference between sum of cube of n and m and sum of square of n and m

import java.util.Scanner;

public class DiffBtwCubenSquare {
    public static int difference(int n, int m) {
        int cube = (n * n * n) + (m * m * m);
        int square = (n * n) + (m * m);
        int difference = cube - square;
        System.out.println("Difference between sum of cube of " + n + " and " + m + " and sum of square of " + n + " and" + m + " is:");
        System.out.println(difference);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter n and m values : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        difference(n,m);


    }
}
