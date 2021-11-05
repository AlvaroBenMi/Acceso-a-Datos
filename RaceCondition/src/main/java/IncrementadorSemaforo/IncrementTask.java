package IncrementadorSemaforo;

import java.util.concurrent.Semaphore;

public class IncrementTask implements Runnable{

    private Accumlator accummulator;
    private int numAccumulator;

    public IncrementTask(Accumlator accummulator, int numAccumulator) {
        this.accummulator = accummulator;
        this.numAccumulator = numAccumulator;
    }


    @Override
    public void run() {
        for (int i = 0; i < numAccumulator; i++) {
            accummulator.inc();
        }
    }
}
