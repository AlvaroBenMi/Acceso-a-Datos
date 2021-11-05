public interface DataSource {

    public void insert(Title title) {

        return jdbc.query(
                SELECT_TITLES,
                params,
                (rs, rownum) ->

                        new Title(
                                rs.getInt("title_id"),
                                rs.getString("title_name"),
                                rs.getString("title_level"),
                                rs.getString("family"),
                                rs.getString("description")
                        )
        );
    }
}
