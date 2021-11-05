package org.iesfm.empresa;

import java.util.Objects;

public abstract class Empleado {
    private String NIF;
    private String Nombre;
    private String Apellidos;
    private int Horas;

    public Empleado(String NIF, String nombre, String apellidos, int horas) {
        this.NIF = NIF;
        Nombre = nombre;
        Apellidos = apellidos;
        Horas = horas;
    }

    public void info(){
        System.out.println(NIF + Nombre + Apellidos + Horas);
        especificInfo();
    }

    protected abstract void especificInfo();

    public void addHours(int hours){
        Horas = Horas + hours;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int horas) {
        Horas = horas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Horas == empleado.Horas && Objects.equals(NIF, empleado.NIF) && Objects.equals(Nombre, empleado.Nombre) && Objects.equals(Apellidos, empleado.Apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIF, Nombre, Apellidos, Horas);
    }
}
