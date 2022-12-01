package misc;

public class Quiz1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int aClone = a;
        int bClone = b;

        a = b = a + b;
        a = a - aClone;
        b = b - bClone;
        System.out.printf("%d %d", a, b);
    }

    int swap() {
        return 1;
    }
}
