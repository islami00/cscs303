/**
 * @file Making this a package means all classes defined in this folder with the package id can be imported relative to the package name.
 */
package lecture1;

import java.text.MessageFormat;
import java.util.*;

public class Lecture1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//  parse int
        parseNums();
//        hellow world
        helloWorld();
        scanEg();
        scanEg2();
    }

    private static void parseNums() {
        String a = "0001";
        float n = Integer.parseInt(a);
        System.out.println(n);
        System.out.printf("hi there %f", n);
    }

    public static void helloWorld() {
        int hello = 0;
        Object[] params = new Object[]{"Hello", "!", hello};
        String msg = MessageFormat.format("{0} world{1} {2}", params);

        System.out.println(msg);
    }

    public static void scanEg() {


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

    public static void scanEg2() {

        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter two classes you take. Csv style [a,b]");
        String pattern = "(\\w+),(\\w+)";
        String classes = sc.next(pattern);
        String[] tins = classes.split(",");
        System.out.format("My Name is:- %s \n I Take the\n following\n classes;\n", name);
        for (String tin : tins) {
            System.out.format("%s\t", tin);
        }

    }
}
