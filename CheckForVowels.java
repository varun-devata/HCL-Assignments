//Write a program to accept an alphabet from the user and check if it is an alphabet or vowel. Use switch-case only.

import java.util.Scanner;

public class CheckForVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " is not an vowel, it is a consonant");
        }

    }
}
