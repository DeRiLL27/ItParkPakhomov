package Lesson6;
import java.util.Arrays;

public class Maxminavg {
    public static void main(String[] args) {
        int n =10;
        double [] array = new double[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 11;
        }
        System.out.println(Arrays.toString(array));

        double max = array[0];
        double min = array[0];
        double avg = 0;

        for(int o = 0; o < array.length; o++) {
            if(max < array[o])
                max = array[o];
            if(min > array[0])
                min = array[0];
                avg = avg + array[o] / array.length;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }
}
