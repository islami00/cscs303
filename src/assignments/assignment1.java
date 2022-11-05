package assignments;

import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;

/**
 * @author Islam Garba Ibrahim 201103018
 */
public class assignment1 {
    public static void main(String[] args) {

        for (question question : questions) {
            question.ans();
        }
    }

    static Scanner s = new Scanner(System.in);

    interface question {
        void ans();
    }

    static question[] questions = new question[]{
            assignment1::qn1,
            assignment1::qn2,
            assignment1::qn3,
            assignment1::qn4,
            assignment1::qn5
    };

    public static void qn1() {
        System.out.println("Question 1");
        System.out.println("Enter a number");
        int x = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            String t = String.format("%s * %s is %s", x, i, i * x);
            System.out.println(t);
        }
    }

    public static void qn2() {
        System.out.println("Question 2");

        System.out.println("Enter width");
        int w = s.nextInt();
        System.out.println("Enter width");
        int height = s.nextInt();
        String txt = String.format("The area is %s", w * height);
        System.out.println(txt);
        txt = String.format("The perimeter is %s", w + height);
        System.out.println(txt);
    }

    static Function<Integer, Integer> naiveFactorial = new Function<>() {

        @Override
        public Integer apply(Integer o) {

            if (o == 0) return 1;

            return o * apply(o - 1);
        }
    };

    public static void qn3() {
        System.out.println("Question 3");

        System.out.println("Enter a number");
        int n = s.nextInt();
        int fac = naiveFactorial.apply(n);
        System.out.printf("The factorial of %s is %s%n", n, fac);
    }

    public static void qn4() {
        System.out.println("Question 4");

        String t;
//        Ref for initializers: https://en.wikipedia.org/wiki/Factorial , Identities for + and *
        float sum = 0;
        int prod = 1;
        float count = 0;
        while (true) {
            System.out.println("Enter a number, or q to stop.");
            t = s.next();
            if (Objects.equals(t, "q")) break;
            int num = Integer.parseInt(t);
            sum += num;
            count += 1;
            prod *= num;
        }
        System.out.printf("The average is %s%n", sum / count);
        System.out.printf("The product is %s%n", prod);
    }

    public static void qn5() {
        System.out.println("Question 5");

        float sum = 0;

        float count = 0;
        while (count != 10) {
            System.out.println("Enter a number");
            int num = s.nextInt();
            sum += num;
            count += 1;
        }
        System.out.printf("The average is %s%n", sum / count);
    }

}
