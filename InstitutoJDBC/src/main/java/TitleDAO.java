import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class TitleDAO {

    private NamedParameterJdbcTemplate jdbc;

    public TitleDAO(NamedParameterJdbcTemplate jdbc){this.jdbc = jdbc;}

    public void insertar(){}

    public List<Title> list(){
        return null;
    }
}
