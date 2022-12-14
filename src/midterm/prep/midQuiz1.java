package midterm.prep;

public class midQuiz1 {
    public static void main(String[] args) {
        qn1(1, 2);
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
}
