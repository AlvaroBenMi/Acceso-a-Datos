package Recondition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class Main {

    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        List<Thread> threads = new LinkedList<>();
        List<Integer> lista = new LinkedList<>();

        for (int i = 0; i <= 100; i++) {
            Thread t = new Thread(new AddToListTask(lista, 100000));
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
        log.info("" + lista.size());
    }
}
