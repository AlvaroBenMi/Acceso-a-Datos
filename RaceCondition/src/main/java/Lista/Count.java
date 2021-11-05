package Lista;

public class Count {

    private int acumulador;

    public Count(int acumulador) {
        this.acumulador = acumulador;
    }

    public synchronized int inc() { return acumulador++;}

    public int getAcumulador() {
        return acumulador;
    }


}
