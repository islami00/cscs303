//Matches name of file

import lecture1.Lecture1;

import java.text.MessageFormat;

/**
 * See <a href="https://youtu.be/l9AzO1FMgM8">javaIn100Secs</a> For more. Lambdas etc
 */
public class Main {
    public static void main(String[] args) {
        int hello = 0;
        Object[] params = new Object[]{devoid(), "!", hello};
        String msg = MessageFormat.format("{0} world{1} {2}", params);

        System.out.println(msg);
        System.out.print(msg);
        Lecture1.scanEg();
    }

    public static String devoid() {
        return "Hello";
    }
}