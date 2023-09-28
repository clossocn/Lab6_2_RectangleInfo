package com.example.lab6_2_rectangleinfo;
import java.util.Scanner;

public class Lab6_2_RectangleInfo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double width, height;
            do {
                System.out.print("Enter the width of the rectangle: ");
                if (scanner.hasNextDouble()) {
                    width = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            } while (true);

            do {
                System.out.print("Enter the height of the rectangle: ");
                if (scanner.hasNextDouble()) {
                    height = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            } while (true);

            double area = width * height;

            double perimeter = 2 * (width + height);

            double diagonal = Math.sqrt(width * width + height * height);

            System.out.println("Area of the rectangle: " + area);
            System.out.println("Perimeter of the rectangle: " + perimeter);
            System.out.println("Length of the diagonal: " + diagonal);

            scanner.close();
        }

}
