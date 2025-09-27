package myJava;

import java.util.Scanner;

public class kartik{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate LCM
        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
                break;
            }
            lcm++;
        }

        scanner.close();
    }
}
    

