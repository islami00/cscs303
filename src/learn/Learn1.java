package learn;

public class Learn1 {

//    int types.

    static short n1 = 4;
//    Fails
//    short number7 = 4L;

    static int number1 = 4;
    //            fails
//    int number1 = 4L;
    static long number2 = 4L;
    //    Fails
//    long number10 =  4F;
    static float number3 = 4F;
    static double number4 = 4.09D;
    //    or
    static double number5 = 4.09;

    //        fails
//    float number6 = 4.09;

    static char joy = '\u24B6';

    public static void main(String[] args) {
        System.out.println(n1);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(joy);
    }
}
