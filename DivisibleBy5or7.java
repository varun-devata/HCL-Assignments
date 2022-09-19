//Question 4
//WAP to return the count of numbers from 1 to n, The numbers which are divisible by either 5 or 7

import java.util.Scanner;

public class DivisibleBy5or7 {
    public static int count(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(i % 5 == 0 || i % 7 == 0) {
                count++;
            }
        }
        System.out.println("The count of numbers from 1 to " + n + " that are divisible by 5 or 7 is : " + count);
        return count;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        count(n);
    }
}
