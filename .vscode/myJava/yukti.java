package myJava;

import java.util.Scanner;

public class yukti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = (base * height) / 2;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}

