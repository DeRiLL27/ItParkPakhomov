package Lesson10;
import java.util.Scanner;

public class TemperatureCalculator {

    public static void main(String[] args) {
        // TODO Auto - generated method stub

        Scanner scan = new Scanner(System.in);
        System.out.println("от Фаренгейта до Цельсия (1) или от Цельция в Фаренгейта (2)");
        int result = scan.nextInt();

        if (result == 1) {
            //Конвертер фаренгейт в цельций

            System.out.println("Вы выбрали градус Фарингейта по Цельсию");
            System.out.println("Введите значение по Фаренгейту");
            double value = scan.nextDouble();
            double valueFinal = (value - 32) * 5/9;
            System.out.println("Цельсия составляет: ");
            System.out.println(Math.round(valueFinal*10.0)/10.0);


        } else if (result == 2) {
            //Конвертер Цельций в фаренгейт

            System.out.println("Вы выбрали Градус Цельсия по Фаренгейту");
            System.out.println("Введите значение по Цельсию");
            double value2 = scan.nextDouble();
            double finalResult = value2 * 1.8 + 32;
            System.out.println("По Фаренгейту-это: ");
            System.out.println(Math.round(finalResult*10.0)/10.0);



        }else {

            //Любое число, которое не равно 1 или 2
            System.out.println("Неправильный выбор");

        }



    }
}
