import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TitleDAO {
    private static final String SELECT_BY_NAME = "SELECT * FROM titles";
    private static final RowMapper<Title> TITLE_ROW_MAPPER =
            (rs, rownum);

    private NamedParameterJdbcTemplate jdbc;

    public TitleDAO(NamedParameterJdbcTemplate jdbc){this.jdbc = jdbc;}

    public void insertar(){}

    public List<Title> list(){
        return null;
    }


    public Title get(Title name) {
        try {

            Map<String, Object> params = new HashMap<>();
            params.put("name", name);
            return jdbc.queryForObject(
                    SELECT_BY_NAME,
                    params,
                    TITLE_ROW_MAPPER
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }
}
