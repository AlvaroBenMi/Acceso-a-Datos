package Company.Readers;

import Company.ClassTables.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class EmployeeReader {
    private static Logger log = LoggerFactory.getLogger(EmployeeReader.class);
    private Scanner scan;

    public EmployeeReader(Scanner scan) {
        this.scan = scan;
    }

    private String askNif(){
        log.info("Inserta nif");
        return scan.next();
    }

    private String askName(){
        log.info("Inserta nombre");
        return scan.nextLine();
    }

    private String askSurname(){
        log.info("Inserta apellido");
        return scan.nextLine();
    }

    private String askRole(){
        log.info("Inserta direccion");
        return scan.nextLine();
    }

    private String askDepartmentName(){
        log.info("Inserta departamento");
        return scan.next();
    }

    public Employee readEmployee(){return new Employee(askNif(), askName(), askSurname(), askRole(), askDepartmentName());}
}
