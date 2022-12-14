package midterm.prep;

import java.util.Scanner;

public class quiz1Qn5 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        qn5();
    }

    static public void qn5() {
        class Area {
            float length;
            float breadth;

            void setDim(float l, float b) {
                this.breadth = b;
                this.length = l;
            }

            float getArea() {
                return this.length * this.breadth;
            }
        }
        Area rect = new Area();
        System.out.println("enter length");
        float len = s.nextFloat();
        System.out.println("enter breadth");
        float breadth = s.nextFloat();
        rect.setDim(len, breadth);

        System.out.printf("Area calculated: %f", rect.getArea());


    }
}
