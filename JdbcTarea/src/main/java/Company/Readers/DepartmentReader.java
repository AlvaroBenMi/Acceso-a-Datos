package Company.Readers;

import Company.ClassTables.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class DepartmentReader {
    private static Logger log = LoggerFactory.getLogger(DepartmentReader.class);
    private Scanner scan;

    public DepartmentReader(Scanner scan) {
        this.scan = scan;
    }

    public String askName(){
        log.info("Inserta nombre");
        return scan.nextLine();
    }

    public String askDescription(){
        log.info("Inserta descripcion");
        return scan.nextLine();
    }

    public Department readDepartment(){return new Department(askName(), askDescription());
    }
}
