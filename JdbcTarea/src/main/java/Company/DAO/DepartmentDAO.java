package Company.DAO;

import Company.ClassTables.Department;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DepartmentDAO {
    private NamedParameterJdbcTemplate jdbc;
    private final static String SELECT_DEPARTMENTS = "SELECT * FROM Department";
    private final static String INSERT_DEPARTMENT = "INSERT INTO Department(" +
            " name, " +
            " description" +
            ") " +
            "VALUES(" +
            " :name, " +
            " :description" +
            ")";

    public DepartmentDAO(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void insertDepartment(Department department){
        Map<String, Object> params = new HashMap<>();
        params.put("name", department.getName());
        params.put("description", department.getDescription());
        jdbc.update(INSERT_DEPARTMENT, params);
    }

    public List<Department> listDepartments(){
        Map<String, Object> params = new HashMap<>();
        return jdbc.query(
                SELECT_DEPARTMENTS,
                params,
                (rs, rowNum) ->
                        new Department(
                                rs.getString("name"),
                                rs.getString("description")
                        )
        );
    }
}


