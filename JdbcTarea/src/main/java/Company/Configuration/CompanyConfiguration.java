package Company.Configuration;

import Company.DAO.DepartmentDAO;
import Company.DAO.EmployeeDAO;
import Company.Menu.Menu;
import Company.Readers.DepartmentReader;
import Company.Readers.EmployeeReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Scanner;

@Configuration
@PropertySource("application.properties")
public class CompanyConfiguration {

    @Bean
    public DepartmentDAO departmentDAO(NamedParameterJdbcTemplate jdbc){return new DepartmentDAO(jdbc);}

    @Bean
    public EmployeeDAO employeeDAO(NamedParameterJdbcTemplate jdbc){return new EmployeeDAO(jdbc);}

    @Bean
    public Scanner scanner (){
        return new Scanner(System.in);
    }

    @Bean
    public DepartmentReader departmentReader(Scanner scan){return new DepartmentReader(scan);}

    @Bean
    public EmployeeReader employeeReader(Scanner scan){return new EmployeeReader(scan);}

    @Bean
    public Menu menu (Scanner scan, DepartmentDAO departmentInsert, EmployeeDAO employeeInsert,
                      DepartmentReader departmentReader, EmployeeReader employeeReader){
        return  new Menu(scan, departmentInsert, employeeInsert, departmentReader, employeeReader);
    };

    @Bean
    public NamedParameterJdbcTemplate jdbcTemplate(DataSource dataSource){
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    public DataSource dataSource(
            // placeholder
            @Value("${database.driver}") String driver,
            @Value("${database.url}") String url,
            @Value("${database.user}") String user,
            @Value("${database.password}") String password
    ){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }
}
