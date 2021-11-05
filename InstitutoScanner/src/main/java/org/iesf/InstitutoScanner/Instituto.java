package org.iesf.InstitutoScanner;

import java.util.List;
import java.util.Objects;

public class Instituto {
    private String nombre;
    private List<String> groups;

    public Instituto(String nombre, List<String> groups) {
        this.nombre = nombre;
        this.groups = groups;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(nombre, instituto.nombre) && Objects.equals(groups, instituto.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, groups);
    }

    @Override
    public String   toString() {
        return "Instituto{" +
                "nombre='" + nombre + '\'' +
                ", groups=" + groups +
                '}';
    }
}
