package Lesson4;

public class Sqrtroot {
    public static  void main(String[] args) {
        //этот метод будет извлекать корень квадратный из введенного числа
        System.out.println(sqrt(8));
    }
    public static int sqrt(int n) {
        int l = 0;
        int r = n;
        int m = (l + r) / 2;
        int t = n;
        for (;;) {   // цикл подсчёта квадратного корня
            m = (l + r) / 2;
            if (m == t || m * m == n)
                break;
            if (m * m < n) {
                l = m;
            } else {
                r = m;
            } t = m;
        }
        return m;
    }
}
