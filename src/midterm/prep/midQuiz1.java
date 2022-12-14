package midterm.prep;

import java.util.Objects;
import java.util.Scanner;

public class midQuiz1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        qn4();
    }

    static void qn1(int a, int b) {

        if (a > b) {
            System.out.printf("%d > %d", a, b);

        } else if (a < b) {
            System.out.printf("%d < %d", a, b);

        } else {
            System.out.printf("%d == %d", a, b);
        }

    }

    static void qn2() {
        System.out.println("Enter a grade");
        int grade = s.nextInt();
        switch (gradeToInt(grade)) {
            case 0 -> System.out.println("F");
            case 1 -> System.out.println("E");
            case 2 -> System.out.println("D");
            case 3 -> System.out.println("C");
            case 4 -> System.out.println("B");
            case 5 -> System.out.println("A");
        }
    }

    /**
     * Ref: https://www.nileuniversity.edu.ng/wp-content/uploads/2021/06/NUN_RG_001_Undergraduate-Students.pdf
     */
    static int gradeToInt(int grade) {
        if (grade < 40) {
            return 0;
        } else if (grade < 45) {
            return 1;
        } else if (grade < 50) {
            return 2;
        } else if (grade < 60) {
            return 3;
        } else if (grade < 70) {
            return 4;
        } else {
            return 5;
        }
    }

    static void qn3() {
        float sum = 0;
        float count = 0;
        System.out.println("Enter an integer");
        String q = "";

        while (!Objects.equals(q, "q")) {
            try {
                q = s.next();
                int nextScore = Integer.parseInt(q);
                sum += nextScore;
                count += 1;
                System.out.println("Enter an integer");
            } catch (Throwable sth) {
//                do nothing
            }

        }

        float avg = sum / count;
        System.out.printf("""
                Sum: %f
                Count: %f
                Average:  %f
                """, sum, count, avg);
    }

    static void qn4() {
        System.out.println("Enter an integer");
        int num = s.nextInt();
        if (isEven(num)) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    static boolean isEven(int x) {
        return (x % 2) == 0;
    }
}
