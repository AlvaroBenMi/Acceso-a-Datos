import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

public class InsertTitleProgram {
    private NamedParameterJdbcTemplate jdbc;
    private final static String INSERT_TITLE = "INSERT INTO title(" +
            "title_name," +
            "title_level," +
            "famaly," +
            "title_description) " +
            "VALUES(" +
            ":name," +
            ":level," +
            ":family" +
            ":descrpition" +
            ")";
    public InsertTitleProgram(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void insertar() {
        Title title = new Title(
                null,
                "Desarrolo de aplicaciones web",
                "GS",
                "Informmatica",
                "Hacer aplicaciones web"
        );

        Map<String, Object> params = new HashMap<>();
        params.put("name", title.getName());
        params.put("level", title.getLevel());
        params.put("family", title.getFamily());
        params.put("description", title.getDescription());
        jdbc.update(INSERT_TITLE, params);
    }
}
