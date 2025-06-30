package Conditional;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Conditional check
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
        
        sc.close();
    }
}
