package Lesson3;

public class Equation {

    public static void main(String[] args) {

        double a, b, c;
        double x1, x2;

        a = 2;
        b = 4;
        c = 6;

        double Discrimenant = b * b - 4 * a * c;

        if (Discrimenant == 0) {
            x1 = (-b) / (2 * a);
            System.out.printf("x1 = x2 = %s", x1);
        } else if (Discrimenant > 0) {
            x1 = (-b + Math.sqrt(Discrimenant)) / (2 * a);
            x2 = (-b - Math.sqrt(Discrimenant)) / (2 * a);
            System.out.printf("x1 = %s, x2 = %s", x1, x2);
        } else {
            System.out.println("Нет целого числа так как дискреминант < 0");
        }
    }
}
