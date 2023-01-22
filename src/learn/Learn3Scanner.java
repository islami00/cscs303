package learn;

import java.util.Scanner;

public class Learn3Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Get data
        System.out.print("What is your name? ");
        String name2 = scanner.nextLine();
//        Print data
        System.out.printf("Hi %s. How old are you? ", name2);
        int age = scanner.nextInt();

//        clear buffer
        scanner.nextLine();
        
        System.out.printf("%d is an excellent age, where are you?  ", age);
        String location = scanner.nextLine();
        System.out.printf("%s is an awesome place", location);

        scanner.close();
    }
}
