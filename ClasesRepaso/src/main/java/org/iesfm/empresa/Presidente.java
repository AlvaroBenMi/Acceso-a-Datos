package org.iesfm.empresa;

import java.util.Objects;

public class Presidente extends Empleado {
    private String nombreCadena;

    public Presidente(String NIF, String nombre, String apellidos, int horas, String nombreCadena) {
        super(NIF, nombre, apellidos, horas);
        this.nombreCadena = nombreCadena;
    }

    public void especificInfo() {
        System.out.println(nombreCadena);
    }

    public String getNombreCadena() {
        return nombreCadena;
    }

    public void setNombreCadena(String nombreCadena) {
        this.nombreCadena = nombreCadena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Presidente that = (Presidente) o;
        return Objects.equals(nombreCadena, that.nombreCadena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nombreCadena);
    }
}

