/**
 * @file Making this a package means all classes defined in this folder with the package id can be imported relative to the package name.
 */
package lecture1;

import java.util.Scanner;

public class Lecture1 {
    public static void main(String[] args) {
        Lecture1.scanEg();
    }

    public static void scanEg() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a number");
        int l1 = sc.nextInt();

        System.out.println("Enter a number");
        int l2 = sc.nextInt();

        System.out.println("Enter a number");
        int l3 = sc.nextInt();

        int sum = l1 + l2 + l3;
        int div = l1 / l2;
        System.out.format("Sum is %d", sum);
        System.out.println();
        System.out.format("Div is %d", div);
        System.out.println();

    }
}
