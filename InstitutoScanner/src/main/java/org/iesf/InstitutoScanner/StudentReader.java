package org.iesf.InstitutoScanner;

import org.iesf.InstitutoScanner.Student;

import java.util.Scanner;

public class StudentReader {
    private Scanner scanner;

    public StudentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Student readStudent(){
        return new Student("65645", "Alvaro", "Benito");
    }
}
