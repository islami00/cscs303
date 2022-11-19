package assignments.utils;

import java.util.Scanner;

public class Temperature {
    Scanner s = new Scanner(System.in);

    public double doConversion() {
        String prompt = """ 
                Select which conversion to perform using the label:
                    1: Celsius to Fahrenheit
                    2: Fahrenheit to Celsius
                """;
        System.out.println(prompt);
        int option = s.nextInt();
        switch (option) {
            case 1: {
                System.out.println("Enter temperature in celsius");
                double temp = s.nextDouble();
                return toFahrenheit(temp);
            }
            case 2: {
                System.out.println("Enter temperature in Fahrenheit");
                double temp = s.nextDouble();
                return toCelsius(temp);
            }
            default: {
                System.out.println("Invalid input");
                return 0;
            }
        }


    }

    double toFahrenheit(double C) {
        return (C * 1.8) + 32;
    }

    double toCelsius(double F) {
        return (F - 32) * ((double) 5 / 9);
    }
}
