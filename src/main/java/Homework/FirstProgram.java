package Homework;

public class FirstProgram {

    public static void main(String[] args) {


        long summa = caclulate(4, 6);
        System.out.println(summa);
        long otherSumma = caclulate(8, 9);
        System.out.println(otherSumma);
        long yetAnotherSumma = caclulate(5, 19);
        System.out.println(yetAnotherSumma);


    }

    public static long caclulate(int doc1, int doc2) {
        return doc1 + doc2;
    }
}
// В этой переменной сложения чисел плюс.