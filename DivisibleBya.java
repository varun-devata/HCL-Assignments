//WAP to return the numbers of integers in given range (a-b), where numbers which are divisible by given number a

import java.util.Scanner;

public class DivisibleBya {
    public static int numbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if(i % a == 0) {
                System.out.print(i + " ");
            }           
        }      
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Numbers divisible by " + a + " from " + a + " to " + b + " are : ");
        numbers(a,b);
    }
}
