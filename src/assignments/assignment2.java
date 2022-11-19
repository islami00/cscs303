package assignments;

import assignments.utils.Temperature;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class assignment2 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        qn1();
        qn2();
        qn3.main();

    }


    static void qn1() {
        System.out.println("Question 1");
        String value = menu();
        double area = getArea(value);
        System.out.printf("The area of the shape is:%n %f%n", area);
    }

    public static void qn2() {
        System.out.println("Question 2");
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number");
            sum += s.nextDouble();
        }
        double avg = sum / 10;
        System.out.printf("The average is:%n %f%n", avg);
    }

    static String menu() {
        String prompt = """ 
                Enter a shape (using the label) to calculate its area:
                    S: Square
                    R: Rectangle
                    T: Triangle
                    C: Circle
                """;
        List<String> validList = Arrays.asList("S", "R", "T", "C");
        String selected;
        do {
            System.out.println(prompt);
            selected = s.next();
            if (!validList.contains(selected)) {
                System.out.println("Invalid Label");
            }
        } while (!validList.contains(selected));
        return selected;
    }

    public static double getArea(String value) {

        switch (value) {
            case "S": {
                System.out.println("Enter length");
                double len = s.nextDouble();
                return squareArea(len);
            }
            case "R": {
                System.out.println("Enter length");
                double len = s.nextDouble();
                System.out.println("Enter breadth");
                double b = s.nextDouble();
                return rectangleArea(len, b);
            }
            case "T": {
                System.out.println("Enter breadth");
                double br = s.nextDouble();
                System.out.println("Enter height");
                double height = s.nextDouble();
                return triangleArea(br, height);
            }
            case "C": {
                System.out.println("Enter radius");
                double r = s.nextDouble();
                return circleArea(r);
            }
            default:
                System.out.println("Uncaught invalid label");
                return 0;
        }
    }

    public static double squareArea(double l) {
        return l * l;
    }

    public static double rectangleArea(double l, double b) {
        return l * b;

    }

    public static double triangleArea(double b, double h) {
        return 0.5 * b * h;
    }

    static double pi = 3.142;

    public static double circleArea(double r) {
        return pi * r * r;
    }

}

class qn3 {
    public static void main() {
        System.out.println("Question 3");
        Temperature t = new Temperature();
        double value = t.doConversion();
        System.out.printf("The result is%n %f%n", value);
    }
}