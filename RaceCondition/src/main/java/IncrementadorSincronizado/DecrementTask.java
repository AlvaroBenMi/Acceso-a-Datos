package IncrementadorSincronizado;

public class DecrementTask implements Runnable{

    private Accumlator accumlator;
    private int numAccumulator;

    public DecrementTask(Accumlator accumlator, int numAccumulator) {
        this.accumlator = accumlator;
        this.numAccumulator = numAccumulator;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < numAccumulator; i++) {
            accumlator.dec();
        }
    }
}
