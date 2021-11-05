package org.iesf.InstitutoScanner;

import java.util.List;
import java.util.Objects;

public class Group {
    private String letra;
    private int curso;
    private List<String> students;

    public Group(String letra, int curso, List<String> students) {
        this.letra = letra;
        this.curso = curso;
        this.students = students;
    }



    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return curso == group.curso && Objects.equals(letra, group.letra) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(letra, curso, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "letra='" + letra + '\'' +
                ", curso=" + curso +
                ", students=" + students +
                '}';
    }
}
