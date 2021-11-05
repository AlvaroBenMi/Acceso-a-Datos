package Lista;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Cuantas veces lo vas a repetir: ");
        int repeticiones = scan.nextInt();

        Count counter = new Count(repeticiones);

        List<Thread> threads = new LinkedList<>();

        for (int i = 0; i <= 100; i++) {
            Task raceTask = new Task(counter, repeticiones);
            Thread t = new Thread(raceTask);
            t.start();
            threads.add(t);
        }

        for (Thread thread:threads) {
            try{
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        log.info("" + counter.getAcumulador());
    }
}
