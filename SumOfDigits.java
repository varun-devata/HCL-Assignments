//

import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int n){
        int sum = 0;
        int rem = 0;
        int num = n;

        while(num != 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of digits of the number " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sum(n);
    }
}
