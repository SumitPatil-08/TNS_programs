package Conditional;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take age input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check eligibility using conditional statement
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote. You must be at least 18 years old.");
        }

        sc.close();
    }
}
