package org.iesf.InstitutoScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupReader {
    private Scanner scanner;

    public GroupReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Group readGroup(){
        List<String> estudiantes = new ArrayList<>();
        return new Group("A",2, estudiantes);
    }
}
