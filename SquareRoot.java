//Write a program to find square root of a given number using java.Math class

import java.util.Scanner;
import java.math.*;

public class SquareRoot {
    public static double getSquareRoot(double n) {
        double sqrt = Math.sqrt(n);
        System.out.println("The square root of " + n + " is :" );
        System.out.println(sqrt);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double n = sc.nextDouble();
        getSquareRoot(n);

    }

}
