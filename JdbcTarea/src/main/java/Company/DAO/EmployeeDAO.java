package Company.DAO;

import Company.ClassTables.Employee;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDAO {
    private NamedParameterJdbcTemplate jdbc;
    private final static String SELECT_EMPLOYEES = "SELECT * FROM Employee";
    private final static String SELECT_DEPARTMENT_EMPLOYEES = "SELECT * FROM Employee WHERE Department = :department";
    private final static String INSERT_EMPLOYEE = "INSERT INTO Employee(" +
            "nif," +
            "name," +
            "surname," +
            "role," +
            "department_name" +
            ")" +
            "VALUES(" +
            ":nif," +
            ":name," +
            ":surname," +
            ":role," +
            ":department_name" +
            ")";

    public EmployeeDAO(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void insertEmployee(Employee employee){
        Map<String, Object> params = new HashMap<>();
        params.put("nif", employee.getNif());
        params.put("name", employee.getName());
        params.put("surname", employee.getSurname());
        params.put("direction", employee.getRole());
        params.put("department", employee.getDepartment_name());
        jdbc.update(INSERT_EMPLOYEE, params);
    }

    public List<Employee> listEmployees(String s){
        Map<String, Object> params = new HashMap<>();
        return jdbc.query(
                SELECT_EMPLOYEES,
                params,
                (rs, rowNum) ->
                        new Employee(
                                rs.getString("nif"),
                                rs.getString("name"),
                                rs.getString("surname"),
                                rs.getString("role"),
                                rs.getString("department_name")
                        )
        );
    }

    public List<Employee> getDepartmentEmployees(String department){
        Map<String, Object> params = new HashMap<>();
        params.put("department", department);
        return jdbc.query(
                SELECT_DEPARTMENT_EMPLOYEES,
                params,
                (rs, rowNum) ->
                    new Employee(
                            rs.getString("nif"),
                            rs.getString("name"),
                            rs.getString("surname"),
                            rs.getString("role"),
                            rs.getString("department_name")
                    )
        );
    }
}
