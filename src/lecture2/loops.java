package lecture2;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        forLoop();
        forEachEg();
        days();
        exampleMethod();
        helloExample();
    }

    static void forLoop() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }

    static void forEachEg() {
        String[] stuff = {"volvo", "jeep", "BMW", "Ford", "RX"};
        for (String s : stuff) {
            System.out.println(s);
        }
    }

    static Scanner s = new Scanner(System.in);

    static void days() {
        System.out.println("Welcome to Days of the Week!%nPick a Day!");
        int day = s.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
        }
    }

    static void exampleMethod() {
        System.out.println("Log!");
    }

    static void helloExample() {
        helloMethod("Yasmin");
        helloMethod("Jacob");
        helloMethod("Pau;l");

    }

    static void helloMethod(String name) {
        System.out.println(name);

    }

}
