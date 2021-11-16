package Lesson5;

public class Fibonacci {
    public static void main (String[] args) {

        int f1 = 1;
        int f2 = 1;
        int f3;
        System.out.println(f1 + " " + f2 + " ");

        for(int a = 3; a <= 18; a++) {
            f3 = f1 + f2;
            System.out.println(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
}
}
