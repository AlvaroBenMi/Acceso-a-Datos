package org.iesfm.empresa;

public class Cajero extends Empleado {
    private String Tienda;
    private int numCaja;

    public Cajero(String NIF, String nombre, String apellidos, int horas, String tienda, int numCaja) {
        super(NIF, nombre, apellidos, horas);
        Tienda = tienda;
        this.numCaja = numCaja;
    }

    @Override
    public void especificInfo() {
        System.out.println(Tienda + numCaja);
    }

    public String getTienda() {
        return Tienda;
    }

    public void setTienda(String tienda) {
        Tienda = tienda;
    }

    public int getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(int numCaja) {
        this.numCaja = numCaja;
    }
}
