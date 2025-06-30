package Conditional;

import java.util.Scanner;

public class BloodDonationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input age and weight
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your weight in kg: ");
        int weight = sc.nextInt();

        // Check eligibility using conditional statements
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You are not eligible to donate blood due to insufficient weight.");
            }
        } else {
            System.out.println("You are not eligible to donate blood due to age below 18.");
        }

        sc.close();
    }
}
