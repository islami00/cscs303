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
        if (option == 1) {
            System.out.println("Enter temperature in celsius");
            double temp = s.nextDouble();
            return toFarenheight(temp);
        } else {
            System.out.println("Enter temperature in Fahrenheit");
            double temp = s.nextDouble();
            return toCelcius(temp);
        }

    }

    double toFarenheight(double C) {
        return (C * 1.8) + 32;
    }

    double toCelcius(double F) {
        return (F - 32) * ((double) 5 / 9);
    }
}
