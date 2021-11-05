package IncrementadorSincronizado;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Accumlator acc = new Accumlator();

        Thread threadInc = new Thread(new IncrementTask(acc, 5));
        threadInc.start();

        Thread threadDec = new Thread(new DecrementTask(acc, 2));
        threadDec.start();

        try {
            threadInc.join();
            threadDec.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        log.info("" + acc.getValue());
    }


}
