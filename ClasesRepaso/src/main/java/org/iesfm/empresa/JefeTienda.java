package org.iesfm.empresa;

import java.util.Objects;

public class JefeTienda extends Empleado{
    private String Tienda;

    public JefeTienda(String NIF, String nombre, String apellidos, int horas, String tienda) {
        super(NIF, nombre, apellidos, horas);
        Tienda = tienda;
    }

    public void especificInfo() {
        System.out.println(Tienda);
    }

    public String getTienda() {
        return Tienda;
    }

    public void setTienda(String tienda) {
        Tienda = tienda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JefeTienda that = (JefeTienda) o;
        return Objects.equals(Tienda, that.Tienda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Tienda);
    }
}
