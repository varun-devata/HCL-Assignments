//WAP to return sum of numbers in given range (a-b), The numbers which are divisible by given number n

import java.util.Scanner;

public class DivisibleByn {
    public static int numbers(int a, int b, int n) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if(i % n == 0) {
                sum += i;
            }
            
        }
        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        System.out.println("Sum of numbers divisible by " + n + " from " + a + " to " + b + " are : ");
        numbers(a,b,n);
    }    
}
