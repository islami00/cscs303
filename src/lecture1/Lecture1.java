/**
 * @file Making this a package means all classes defined in this folder with the package id can be imported relative to the package name.
 */
package lecture1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Lecture1 {
    public static void main(String[] args) {
        helloWorld();
        scanEg();
    }

    public static void helloWorld() {
        int hello = 0;
        Object[] params = new Object[]{"Hello", "!", hello};
        String msg = MessageFormat.format("{0} world{1} {2}", params);

        System.out.println(msg);
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
        System.out.format("Div of %d/%d is %d", l1, l2, div);
        System.out.println();

    }
}
