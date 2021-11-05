package Lista;

import Lista.Count;

public class Task implements Runnable{

    private Count acumulador;
    private int numAcumulacion;

    public Task(Count acumulador, int numAcumulacion) {
        this.acumulador = acumulador;
        this.numAcumulacion = numAcumulacion;
    }

    @Override
    public void run() {
        for (int i = 0; i < numAcumulacion; i++) {
            acumulador.inc();
        }

    }
}
