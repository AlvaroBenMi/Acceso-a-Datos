package org.iesf.InstitutoScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstitutoReader {
    private Scanner scanner;

    public InstitutoReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Instituto readInstituto(){
        List<String> groups = new ArrayList<>();
        return new Instituto("Federica Montseny", groups);
    }
}
