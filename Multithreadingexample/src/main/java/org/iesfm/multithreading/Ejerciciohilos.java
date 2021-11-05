package org.iesfm.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Ejerciciohilos {
    public static void main(String[] args) {
        Runnable average = new Runnable() {
            @Override
            public void run() {
                List<Double> numbers = new ArrayList<>();
                numbers.add(4.0);
                numbers.add(3.5);
                numbers.add(4.5);

                System.out.println(avg(numbers));

                }
            };
        Thread averagethread = new Thread(average);
        averagethread.start();

        }
    static double avg(List<Double> numbers){
        double med = 0;
        for (int i = 0; i < numbers.size(); i++) {
            med += numbers.get(i);
        }
        return med / numbers.size();
    }
}
