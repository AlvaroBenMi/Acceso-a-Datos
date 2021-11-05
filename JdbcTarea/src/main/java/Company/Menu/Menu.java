package Company.Menu;

import Company.ClassTables.Department;
import Company.ClassTables.Employee;
import Company.DAO.DepartmentDAO;
import Company.DAO.EmployeeDAO;
import Company.Readers.DepartmentReader;
import Company.Readers.EmployeeReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Menu {
    private static Logger log = LoggerFactory.getLogger(Menu.class);

    private Scanner scan;

    private DepartmentDAO departmentDAO;
    private EmployeeDAO employeeDAO;

    private DepartmentReader departmentReader;
    private EmployeeReader employeeReader;

    public Menu(Scanner scan, DepartmentDAO departmentInsert, EmployeeDAO employeeInsert,
                DepartmentReader departmentReader, EmployeeReader employeeReader) {
        this.scan = scan;
        this.departmentDAO = departmentInsert;
        this.employeeDAO = employeeInsert;
        this.departmentReader = departmentReader;
        this.employeeReader = employeeReader;
    }

    private void menu(){
        log.info("\n" +
                "//** MENU PRINCIPAL **//" + "\n" +
                "1. Mostar departamentos" + "\n" +
                "2. Mostrar empleados de un departamento" + "\n" +
                "3. Insertar departamento nuevo" + "\n" +
                "4. Salir" + "\n"
                );
    }

    public void chooseOption(){
        List<Department> departmentList;
        List<Employee> employeeList;
        int option;
        do {
            log.info("Elige una accion");
            menu();
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    log.info("SHOW DEPARTMENT");
                    departmentList = departmentDAO.listDepartments();
                    for (Department department : departmentList) {
                        log.info(department.toString());
                    }
                    log.info("\n");
                    break;

                case 2:
                    log.info("SHOW EMPLOYEES");
                    employeeList = employeeDAO.listEmployees(departmentReader.askName());
                    for (Employee employee : employeeList){
                        log.info(employee.toString());
                    }
                    log.info("\n");
                    break;

                case 3:
                    log.info("DEPARTMENT INSERT");
                    departmentDAO.insertDepartment(departmentReader.readDepartment());
                    log.info("\n");
                    break;

                default:
                    log.info("Ending program");
                    break;
            }
        } while (option != 4);
    }
}
